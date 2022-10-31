package kodluyoruz.ToDoList.config;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import javax.annotation.PostConstruct;

import org.springframework.context.annotation.Configuration;

import kodluyoruz.ToDoList.model.todoList;


@Configuration
public class todoListConfiguration {
    
      
	  public class todolist {

		}

		public static List<todoList> todolist = new CopyOnWriteArrayList<>();

	    @PostConstruct
	    public void filltodoListRepo(){
	        todoList todo = new todoList();
	        todo.setId(1542);
	        todo.setDay("Pazartesi");
	        todo.setContent("spor 08.00");
	        
	        todoList todo2 = new todoList();
	        todo.setId(265);
	        todo.setDay("Salı");
	        todo.setContent("1-3 arası okula git");

	        todoList todo3 = new todoList();
	        todo.setId(323);
	        todo.setDay("Çarşamba");
	        todo.setContent("proje toplantısı 12.00");

	        todoList todo4 = new todoList();
	        todo.setId(454);
	        todo.setDay("Perşembe");
	        todo.setContent("online eğitim 11.00");

	        todoList todo5 = new todoList();
	        todo.setId(578);
	        todo.setDay("Cuma");
	        todo.setContent("bitirme projesi 20.00");

	        todolist.add(todo);
	        todolist.add(todo2);
	        todolist.add(todo3);
	        todolist.add(todo4);
	        todolist.add(todo5);
	       
	    }
}
