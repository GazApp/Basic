package gaz.app.hello;

public class Numbers {

	public static void main(String[] args) {
		
		float MaxlfloatValue = Float.MAX_VALUE;
        float MinlfloatValue = Float.MIN_VALUE;
        System.out.println("Float mininum value :" + MaxlfloatValue);
        System.out.println("Float mininum value :" + MinlfloatValue);

        double MaxldoubleValue = Double.MAX_VALUE;
        double MinldoubleValue = Double.MIN_VALUE;
        System.out.println("double mininum value :" + MaxldoubleValue);
        System.out.println("double mininum value :" + MinldoubleValue);

        int IntValue = 100/3;
        float floatValue = 100f/3f;
        double DoubleValue = 100d/3d;

        // casting
        float floatValue2 = (float)(55.25);
        //CTRL+ALT+L= FORMATO
        // shift + teclas ) moverse para arriba, abajo, etc.
        /* java: maneja mejor el double, muchas bibliotecas estan optimizadas en Double y las computadoras mas recientes
          estan optimizadas para el double*/

        System.out.println("INt: " + IntValue);
        System.out.println("float: "+ floatValue);
        System.out.println("double: "+ DoubleValue);
	}

}
