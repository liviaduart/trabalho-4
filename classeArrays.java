/**
 *
 * @author liviaduart
 */
public class classeArrays  {

    double[] array1 = new double[10];
    double[] array2 = new double[10];

    public void adicionaArray1(int valor, int posição) {
        if (posição >= 0 && posição <= 9) {
            array1[posição] = valor;
        }
        if (posição < 0 || posição > 9) {
            System.out.println("Por favor digite um valor valido (de 0 a 9)");
        }
    }

    public void adicionaArray2(int valor, int posição) {
        if (posição >= 0 && posição <= 9) {
            array2[posição] = valor;
        }
        if (posição < 0 || posição > 9) {
            System.out.println("Por favor digite um valor valido (de 0 a 9)");
        }
    }

    public void CalculaDivisaoArrays() throws ExcecaoDivisaoResultadoZero {
        //popula array
        for (int i = 0; i < 10; i++) {
            adicionaArray1((int) gerador0a99(), i);
            adicionaArray2((int) gerador0a99(), i);
        }
        for (int i = 0; i < 10; i++) {
            try{
                double resultado;
                resultado = calcula(array1[i], array2[i]);
                System.out.println("Divisão " + i + " = " + resultado);      
                throw new ExcecaoDivisaoResultadoZero();
            }
            catch(ExcecaoDivisaoResultadoZero aex){
                if (array1[i]/array2[i] == 0){
                    System.out.println(aex); 
                }
            }
            finally {
                System.out.println("A = " + array1[i] + " B = " + array2[i]);
            }
    }
    }
    
    public double gerador0a99() {
        double min = 0;
        double max = 99;
        double valorAleatorio = Math.floor(Math.random() * (max - min + 1) + min);
        return valorAleatorio;
    }

    
    public static double calcula(double a, double b) {
        try {
            double c = a / b;
        } catch (ArithmeticException aex) {
            System.out.println("Digite um número válido, não é possível dividir por 0. Erro:\n" + aex);
        }        
        return a/b;
    }
     
    public double[] getArray1() {
        return array1;
    }

    public void setArray1(double[] array1) {
        this.array1 = array1;
    }

    public double[] getArray2() {
        return array2;
    }

    public void setArray2(double[] array2) {
        this.array2 = array2;
    }

}
