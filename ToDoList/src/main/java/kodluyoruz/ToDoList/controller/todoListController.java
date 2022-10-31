package kodluyoruz.ToDoList.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodluyoruz.ToDoList.model.todoList;
import kodluyoruz.ToDoList.model.todoListSaveRequestDto;
import kodluyoruz.ToDoList.model.todoListUpdateRequestDto;
import kodluyoruz.ToDoList.service.todoListService;

@RestController
@RequestMapping("/todolist")
public class todoListController {

		
	    @Autowired
	    todoListService todolistService;
	    
	    @GetMapping("/allTodolist")
	    public List<todoList> allTodolist() {
	    	List<todoList> todolist = todolistService.allTodolist();
	    	return todolist;
	    }
	    

	    @GetMapping("/gettodolist")
	    public ResponseEntity<todoList> gettodolist(@RequestParam(value = "todoId", required = false) int todolistId){
	        todoList todolistById = todolistService.gettodolist(todolistId);
	        if (todolistById == null) {
	        	return new ResponseEntity<>(todolistById , HttpStatus.BAD_REQUEST);
	        }
	        return new ResponseEntity<>(todolistById , HttpStatus.OK);
	   }

	    @PostMapping("/savetodolist")
	    public boolean savetodolist(@RequestBody todoListSaveRequestDto todolistSaveRequestBody){
	        return todolistService.savetodolist(todolistSaveRequestBody);

	    }

	    @PutMapping("/updatetodolist")
	    public boolean updatetodolist(@RequestBody todoListUpdateRequestDto todolistUpdateRequestBody){
	        return todolistService.updatetodolist(todolistUpdateRequestBody);

	    }

	    @DeleteMapping("/deletetodolist")
	    public boolean updatetodolist(@RequestParam int todolistId){
	        return todolistService.deletetodolist(todolistId);

}
}
