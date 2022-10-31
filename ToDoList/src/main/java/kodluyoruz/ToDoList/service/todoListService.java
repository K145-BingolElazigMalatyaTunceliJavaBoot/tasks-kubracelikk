package kodluyoruz.ToDoList.service;

import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Service;

import kodluyoruz.ToDoList.config.todoListConfiguration;
import kodluyoruz.ToDoList.model.todoList;
import kodluyoruz.ToDoList.model.todoListSaveRequestDto;
import kodluyoruz.ToDoList.model.todoListUpdateRequestDto;


@Service
public class todoListService {
	
		
		public List<todoList> allTodolist() {
			List<todoList> todolist = todoListConfiguration.todolist;
			return todolist;
		}

		  public todoList gettodolist(int todolistId) {
		        List<todoList> todolist =  todoListConfiguration.todolist;
		        for (todoList todolist2 : todolist) {
		            if (todolist2.getId() == todolistId) {
		                return todolist2;
		            }
		        }
		        return null;
		    }

		    public boolean savetodolist(todoListSaveRequestDto requestBody) {
		        String day = requestBody.getDay();
		        String content = requestBody.getContent();

		        todoList todo = new todoList();
		        todo.setDay(day);
		        todo.setContent(content);
		        int id = getId();
		       todo.setId(id);

		        List<todoList> todolist = todoListConfiguration.todolist;
		        todolist.add(todo);

		        return true;
		    }

		    private int getId() {
		        Random random = new Random();
		        int id = random.nextInt(1000);
		        return id;
		    }


		    public boolean updatetodolist(todoListUpdateRequestDto updateRequestBody) {
		        int id = updateRequestBody.getId();
		        List<todoList> todolist = todoListConfiguration.todolist;
		        for (todoList todoList2 : todolist) {
		            if (todoList2.getId() == id) {   
		                todoList2.setDay(updateRequestBody.getDay());
		                todoList2.setContent(updateRequestBody.getContent());
		                
		            }
		        }

		        return true;

		    }

		    public boolean deletetodolist(int todolistId) {
		    	 List<todoList> todolist = todoListConfiguration.todolist;
		        for (todoList todoList2 : todolist) {
		            if (todoList2.getId() == todolistId) {
		                todolist.remove(todoList2);
		            }
		        }
		        return true;
		    }

		
	}

