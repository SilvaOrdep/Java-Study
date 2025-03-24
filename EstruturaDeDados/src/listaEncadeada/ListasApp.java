package listaEncadeada;

public class ListasApp {

    public static void main(String[] args) {
        ListaEncadeada minhaLista=new ListaEncadeada();
        // Testa métodos isEmpty, size, add e print
        if(minhaLista.isEmpty())
            System.out.println("Lista Vazia");
        else
            System.out.println("Size="+minhaLista.size());

        minhaLista.print();
        minhaLista.add("Jesus");
        minhaLista.add("José");
        minhaLista.add("Maria");
        minhaLista.add("João");
        minhaLista.add("Pedro");
        minhaLista.add("Judas");
        minhaLista.print();

        // testa indexOf
        String aux="Pedro";
        System.out.println(minhaLista.indexOf(aux));


        // Testa get
        try {
            System.out.println(minhaLista.get(8));
        }
        catch (IndexOutOfBoundsException ex) {
            System.out.println(ex.getMessage());
        }
        try {
            System.out.println(minhaLista.get(2));
        }
        catch (IndexOutOfBoundsException ex) {
            System.out.println(ex.getMessage());
        }

        // testa método add(index, object)
        minhaLista.add(4,"Mario");
        minhaLista.print();

        // TO-DO (coloque seu código aqui para testas os métodos remove e set)


        //remove(index)
        try {
            System.out.println("Teste do método remove(index):");
            System.out.println(minhaLista.size());
            minhaLista.remove(0);
            minhaLista.print();

            System.out.println(minhaLista.size());

        }catch (IndexOutOfBoundsException ex) {
            System.out.println(ex.getMessage());
        }

        //remove(Object)
        minhaLista.remove("Alexander");
        minhaLista.print();

        System.out.println(minhaLista.size());

        //set(index, Object)
        try {
            System.out.println("Teste do método set(index, Object):");
            minhaLista.set(-3, "Clara Maria");
            minhaLista.print();

            System.out.println(minhaLista.size());

        }catch (IndexOutOfBoundsException ex) {
            System.out.println(ex.getMessage());
        }

    }

}
