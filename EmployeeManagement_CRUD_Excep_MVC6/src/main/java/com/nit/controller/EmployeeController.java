package com.nit.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.nit.entity.Employee;
import com.nit.service.EmployeeService;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
	@Autowired
	private EmployeeService empService;

	@GetMapping("/list")
	public String showListOfEmployee(Map<String, Object> map) {
		List<Employee> allEmployees = empService.getAllEmployees();
		map.put("empList", allEmployees);
//	String str=null;             //Generating NPE to Handle Exception
//		System.out.println(str.length());
		                              
		return "list-employees";

	}

	@GetMapping("/add")
	public String addEmployeeData(Map<String, Object> map) {
		Employee emp1 = new Employee();
		map.put("employee", emp1);
		return "add-employee";
	}

	@PostMapping("/save")
	public String saveEmployeeData(@ModelAttribute("employee") Employee e) {
		empService.addEmployee(e);
		return "redirect:/employee/list";
	}

	@GetMapping("/edit/{id}")
	public String showFormWithExistingData(@PathVariable int id, Map<String, Object> map) {
		Employee employeeById = empService.getEmployeeById(id);
		map.put("employee", employeeById);
		return "edit-employee";
	}

	@PostMapping("/update")
	public String updateData(@ModelAttribute("employee") Employee e,Map<String, Object> map) {
		String updateEmployeeMsg = empService.updateEmployee(e);
		map.put("msg",updateEmployeeMsg);
		return "redirect:/employee/list";
	}

	@GetMapping("/delete/{id}")
	public String deleteData(@PathVariable int id,RedirectAttributes att) {
		String deleteEmployeeMsg = empService.deleteEmployee(id);
		att.addAttribute("msg",deleteEmployeeMsg);
		return "redirect:/employee/list";
	}
	
	
	@GetMapping("/page") //?? how to dispaly, we have to change url then page display
	public String showEmpPageInfo(@PageableDefault(page = 0,size = 2,direction = Direction.ASC,sort ="name" ) Pageable pageable,RedirectAttributes attribute)
	{//start from page 0,3 records per page
		Page<Employee> employeereportDataByPage = empService.getEmployeereportDataByPage(pageable);
		System.out.println(employeereportDataByPage);
		attribute.addFlashAttribute("pageInfo", employeereportDataByPage);
		return "redirect:/employee/list";
		
	}
	
	
	
	//Handling Exception single Controller class(specific controller class)

	//@ExceptionHandler({NullPointerException.class,NumberFormatException.class})
/*	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR) 
	@ExceptionHandler(value = NullPointerException.class)
	public String handleNullPointerException(Model model)
	{
		model.addAttribute("excep", "Null Pointer Exception Found !!  [from EmployeeController class]");
		return "nullPointer_Exp";
		
	}
	@ExceptionHandler(value = Exception.class)
	@ResponseStatus(value =HttpStatus.BAD_REQUEST) //send ERROR status code[Recommended]
	public String handleGenericException(Model model)
	{
		model.addAttribute("excep", "Handle Any Type of Exception (Generalized Exception) !! [from EmployeeController class]");
		return "Generic_Exp";
		
	}*/
}

/*
 ✔ page = 0

→ start from page 0

✔ size = 3

→ 3 records per page

✔ sort = "job"

→ sorting by job column

✔ direction = ASC

→ ascending order
 */


/*
 * POST → Redirect → GET is the Post/Redirect/Get (PRG) pattern. If you return a
 * view directly after a POST, the browser will re-submit the form when the user
 * refreshes (duplicate insert/update). Redirect avoids that.
 * It prevents duplicate submissions
 */