// NORMAL INNER CLASS :  Building Outer Class and Specific Flat is Inner Class

class Outer{                                        // Parent Class Object Class
	class Inner{				    // Parent Class Object Class ; for proof check byte and invokespecial line
		Outer$Inner(Outer){
			this$0 ;                      // bytecode
			super();
		}

	}
}

// Class File : Outer.class ; Outer$Inner.class
