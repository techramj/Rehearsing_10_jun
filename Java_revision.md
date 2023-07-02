# Memory allocation
	## type of variables
	Instance : heap
	local  : statck
	global 
	static : data segment
	
	datatype:
	int
	float
	double
	long
	
# Pointer
		1. local variable don't have default value
		
		
# difference between
		pass by value (java)
		pass by address
		pass by reference
		
# access specifier
		private : cannot be access outside the class
		default : cannot be access outside the package
		protected :cannot be access outside the package except in the  subclass
		public
		
# equals method
		@Override
			public boolean equals(Object obj) {
				if (obj == null) {
					return false;
				}
				if(this == obj) {
					return true;
				}
				if (obj instanceof Employee) {
					Employee emp = (Employee) obj;
					return this.id == emp.id && this.name.equals(emp.name)
							&& Double.doubleToLongBits(this.salary) == Double.doubleToLongBits(emp.salary);
				}
				return false;
			}
		 		
		 		
# inheritance  and polymorphism



# binding (calling of a non static method)
       types of Binding
       static / compile time
       dynamic / runtime (java support only dynamic binding)

       class A{
       	int a = 10;
       	method1(){
       	sysout("methodA");
       	}
       	//getter
       	
       }
       
       class B{
       	int a = 100;
       	method1(){sysout("methodB");}
       	method2(){sysout("method2 of B class");}
       	//getter
       }
		
		A ob1  = new B();
		B ob2 = new B(); 
		
		ob1.method1();
		sysout(ob1.a); //10
		sysout(ob2.a); //100
		sysout(ob1.getA()); //100
		sysout(ob2.getA()); //100
		
		ob1.method2(); //compiler
		((B)ob1).method2();
		
		
# method overloading vs method overriding
		method overloading: same name different signature
		1. no of parameter
		2. type of parameter
		3. sequence in which parameter passed
		method overloading doesn't depend upon return type
		
		method overriding: same name, same signature and same return type
		
	
