package com.todo.dao;

import java.util.Date;
import java.text.SimpleDateFormat;

public class TodoItem {
    private String title;
    private String desc;
    private String current_date;
    private String category;
 

	@Override
	public String toString() {
		return "TodoItem [title=" + title + ", desc=" + desc + ", current_date=" + current_date + ", category="
				+ category + ", due_date=" + due_date + "]";
	}

	private String due_date;
	
	public TodoItem(String title, String desc, String due_date, String category){
        this.title=title;
        this.desc=desc;
        this.due_date = due_date;
        SimpleDateFormat f = new SimpleDateFormat("yyyy/MM/dd kk:mm:ss");
        this.current_date=f.format(new Date());
        this.category = category;
    }
	/*
	public TodoItem(String title, String desc, String current_date) {
		this.title=title;
        this.desc=desc;
        this.current_date = current_date;
	}
	*/
	public TodoItem(String title, String desc, String current_date, String due_date, String category) {
		this.title=title;
        this.desc=desc;
        this.current_date = current_date;
        this.due_date = due_date;
        this.category = category;
	}
    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getCurrent_date() {
        return current_date;
    }

    public void setCurrent_date(String current_date) {
        this.current_date = current_date;
    }
    
    public String getCategory() {
		return category;
	}
    
	public void setCategory(String category) {
		this.category = category;
	}
	
	public String getDue_date() {
		return due_date;
	}
	
	public void setDue_date(String due_date) {
		this.due_date = due_date;
	}

	public String toSaveString() {
		return title + "##" + category +"##" + desc + "##" + due_date + "##" + current_date + "\n";
	}
}
