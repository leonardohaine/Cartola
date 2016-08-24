package br.com.cartola.liga;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class Autenticacao {
	
	public static void main(String[] args) throws Exception, IOException {
		
		CloseableHttpClient httpclient = HttpClients.createDefault();
		HttpPost post = new HttpPost("https://login.globo.com/api/authentication");
		//https://api.cartolafc.globo.com/auth/liga/copa-varzea-2016
		post.setHeader("Content-type", "application/json");
		
		//HttpPost httpPost = new HttpPost("http://targethost/login");
		List <BasicNameValuePair> nvps = new ArrayList <BasicNameValuePair>();
		nvps.add(new BasicNameValuePair("username", "vip"));
		nvps.add(new BasicNameValuePair("password", "secret"));
		post.setEntity(new UrlEncodedFormEntity(nvps));
		
		
		String jsonLogin = "{\"payload\":{\"email\":\"leonardo.haine@gmail.com\",\"password\":\"leonardo1010\",\"serviceId\": 438}}";
		
		HttpEntity entity = new ByteArrayEntity(jsonLogin.getBytes("UTF-8"));
		post.setEntity(entity);
		
		//CloseableHttpResponse response = httpclient.execute(post);
		HttpResponse response = httpclient.execute(post);
		System.out.println(response.getStatusLine().getStatusCode());
		//if(response.getStatusLine().getStatusCode() == 200){
		
        String result = EntityUtils.toString(response.getEntity());
			System.out.println("Resultado: " + result);
			getToken(result);
			Login login = (Login) JsonToJava(result, new Login());
			System.out.println("Mensagem: " + login.getUsermessage());
		//}{"id":"BadCredentials","userMessage":"Seu e-mail ou senha estão incorretos."}
			
			getLiga(null,login.getGlbid());

	}
	
	public static Object JsonToJava(String json, Object clazz) throws Exception{
		ObjectMapper mapper = new ObjectMapper();
		
		String jsonInString = json;
		
		if(clazz instanceof Login){
			Login login = mapper.readValue(jsonInString, Login.class);
			clazz = login;
			System.out.println("Login: " + login);
		}else if(clazz instanceof Liga){
			Liga liga = mapper.readValue(jsonInString, Liga.class);
			clazz = liga;
			System.out.println("Liga: " + liga.getDestaques().getRodada().getNome());
		}
		return clazz;
	}
	
	public static String getToken(String json) throws JsonParseException, JsonMappingException, IOException{
		ObjectMapper mapper = new ObjectMapper();
	
		
		String jsonInString = json;
		Login login = mapper.readValue(jsonInString, Login.class);
		System.out.println("Token: " + login.getGlbid());
		
		return login.getGlbid();
	}
	
	public static Liga getLiga(String jsonLiga, String gblToken) throws Exception{
		
		
		CloseableHttpClient httpclient = HttpClients.createDefault();
		HttpGet post = new HttpGet("https://api.cartolafc.globo.com/auth/liga/copa-varzea-2016");
		//https://api.cartolafc.globo.com/auth/liga/copa-varzea-2016
		post.setHeader("Content-type", "application/json");
		post.setHeader("X-GLB-Token", gblToken);
		
		//HttpEntity entity = new ByteArrayEntity(jsonLiga.getBytes("UTF-8"));
		//post.setEntity(entity);
		
		HttpResponse response = httpclient.execute(post);
		System.out.println(response.getStatusLine().getStatusCode());
		//if(response.getStatusLine().getStatusCode() == 200){
		
        String result = EntityUtils.toString(response.getEntity());
			System.out.println("Resultado: " + result);
		
			Liga liga = (Liga) JsonToJava(result, new Liga());
			System.out.println("Nome: " + liga.getLiga().getDescricao());
			List<Time> times = liga.getTimes();
			for(Time t : liga.getTimes()){
				System.out.println("Times: " + t.getNome() + " - " +
								   "Pontos: " + String.format("%1$,.2f", t.getPontos().getCampeonato()) + " - " +
								   "Rodada: " + String.format("%1$,.2f", t.getPontos().getRodada()));
			}
			
		
		return liga;
	}
	
}
