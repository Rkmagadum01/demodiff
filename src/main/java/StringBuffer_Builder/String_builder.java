package StringBuffer_Builder;

public class String_builder {
		public static void main(String[] args) {
			
			//three types of constructer are thier 
			//1st constructer type
			StringBuilder sbuilder=new StringBuilder();
			
			//capacity() method
			System.out.println(sbuilder.capacity());//by default capacity is 16
			
			//appned method
			sbuilder.append("Heelo");
			sbuilder.append(" Java");
			System.out.println(sbuilder);
			
			//insert method
			sbuilder.insert(1 , "###");
			System.out.println(sbuilder);
			
			//delete method
			sbuilder.deleteCharAt(2);
			System.out.println(sbuilder);
			sbuilder.delete(2, 6);
			System.out.println(sbuilder);
			
			//reverse method
			sbuilder.reverse();
		    System.out.println(sbuilder);
		    sbuilder.reverse();
		    System.out.println(sbuilder);
		    
		    sbuilder.append("Good morning Java");
		    System.out.println(sbuilder.capacity());//if length become more than 16, then capacity will be (16*2)+2=34
		    
		}
		}

