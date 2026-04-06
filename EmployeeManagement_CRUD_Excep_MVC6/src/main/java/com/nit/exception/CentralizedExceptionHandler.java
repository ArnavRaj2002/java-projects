package com.nit.exception;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
//Handling Exception for All Controller classes(whole project)
@ControllerAdvice
public class CentralizedExceptionHandler {
	//@ExceptionHandler({NullPointerException.class,NumberFormatException.class})
		//@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR) 
		@ExceptionHandler(value = NullPointerException.class)
		//@ExceptionHandler(NullPointerException.class)
		public String handleNullPointerException(Model model)
		{
			model.addAttribute("excep", "Null Pointer Exception Found !! == [from CentralizedExceptionHandler]");
			return "nullPointer_Exp";
			
		}
//		@ExceptionHandler(value = Exception.class)
//		@ResponseStatus(value =HttpStatus.BAD_REQUEST) //send ERROR status code[Recommended]
//		public String handleGenericException(Model model)
//		{
//			model.addAttribute("excep", "Handle Any Type of Exception (Generalised Exception) !! ---> [from CentralizedExceptionHandler]");
//			return "Generic_Exp";
//			
//		}
}
