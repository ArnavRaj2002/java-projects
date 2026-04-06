package com.nit.service;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.nit.modal.Student;

@Service                       
public class StudentConsumerService implements IStudentConsumerService {
	// private final webClien webClient=WebClient.create("http://localhost:8081/");
  
 private final WebClient webClient=WebClient.create();//Creating webClient
	 @Override
	 public Student getStudentById(int id) 
	 {
		 return  webClient
		 .post()
		 .uri("http://localhost:8083/RESTAPI4_studentProducerWebClients/producer/student/{id}",id)
		 .retrieve() //call provider endpoint method and recive http response [in JSON]
		 .bodyToMono(Student.class) //store json in modal class object
		 .block();
		 
		 
	 }
	 
//	@Override
//	public Student getStudentById(int id) {
//		System.out.println("StudentConsumerService.getStudentById()");
//	return webClient
//		.get() //[Make GET request]
//		.uri("http://localhost:8083/RESTAPI4_studentProducerWebClients/producer/student/1") //[sets the URL] where the GET request will be sent.
//		.retrieve() //Send the HTTP request+Get the HTTP response[call the API]
//		.bodyToMono(Student.class) //Convert the HTTP response body into a Student object [Convert JSON → Java class]
//		                              //After the server sends back a JSON response[Convert response JSON into Java object]
//		.block(); //converts asynchronous call → into synchronous.
//		//Wait for result (stop program until response)
//	}   //Consumer thread → waits (blocked) until API responds.
//	
	
	
	
	
	
	
	
	
//	private final WebClient webclient=WebClient.create("http://localhost:8083/"); //base url[server url]	
//	@Override
//	public Student getStudentById(int id) {
//		return 	 webclient
//		.post() //send post/get request to API
//		.uri("/getByID/5") //producer rest endpoint url/path
//	    .body(Mono.just(new Student(123,"raj","it",5)),Student.class)//convert java to json and send json request to api and api receive json and conver json to java using @requestbody and perform operation and with the help of @response body convert java to json response
//or // .bodyValue(new Student(321,"singh","ece",25))
//		.retrieve()//it will send http request to api in json and accpet http response in json
//		.bodyToMono(Student.class)//it convert json response to java object
//		.block();//consumer will wait until api completes its task/execution
//		 
//}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

/*.body(Mono.just(obj), Obj.class) → “Here is the data I want to send”
Take this Java object → convert it into JSON → send to API	
  
#Consumer (your WebClient) → sends Java object
→ Jackson converts Java → JSON
→ JSON is sent to
#Producer (REST API server)	 
	
👉 Consumer sends Java → converted to JSON
👉 Producer receives JSON → converted to Java
*/
}
