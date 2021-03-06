package com.example.lottery.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

// Ctrl + Shift + O : Organize Import
// Alt + Shift + S
// POJO: Plain Old Java Object
// Class -> Component -> Application Server 
// Class -> Object : new LotteryViewModel
// Component-based Programming : do not use new!
// Container (Application Server -> TomEE) -> Life Cycle
// Annotation (Java SE 5) -> Declarative Programming
// Bean -> Component
// CDI Bean -> CDI Component
// Spring Bean -> Spring Component
@SuppressWarnings("serial")
@Named("lottery") // CDI (Context and Dependency Injection) Component
@SessionScoped // Scope: created when request received, destroyed when response sent
public class LotteryViewModel implements Serializable {
	// ${lottery.numbers} : JSP Expression Language
	private List<List<Integer>> numbers; // lottery numbers -> JSP (Java Server Pages) -> HTML

	public LotteryViewModel() {
		numbers = new ArrayList<>();
	}

	public List<List<Integer>> getNumbers() {
		return numbers;
	}

	public void setNumbers(List<List<Integer>> numbers) {
		this.numbers = numbers;
	}
	
}
