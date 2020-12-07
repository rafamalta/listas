import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add(2, "Marco"); //adiciona o elemento na posi��o 2
		System.out.println(list.size()); //mostra a quantidade de elementos da lista
		for (String x : list) {
		System.out.println(x);
		}
		System.out.println("---------------------");
		list.removeIf(x -> x.charAt(0) == 'M'); //remove todos os elementos que come�am com M
		for (String x : list) {
		System.out.println(x);
		}
		//list.remove("Anna"); //remove a Anna da lista
		//list.remove(1); //remove o elemento 1 da lista
		System.out.println("---------------------");
		System.out.println("Index of Bob: " + list.indexOf("Bob")); //mostra a posi��o do nome Bob(caso n�o encontre o nome retorna -1)
		System.out.println("Index of Marco: " + list.indexOf("Marco")); //mostra a posi��o do nome Marco(caso n�o encontre o nome retorna -1)
		System.out.println("---------------------");
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList()); /*mostra todos os nomes que come�am com A
		caso n�o encontre nenhum n�o retorna nada */
		for (String x : result) {
		System.out.println(x);
		}
		System.out.println("---------------------");
		String name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
		System.out.println(name);
		/* retorna o primeiro elemento com a letra A. Caso n�o exista vai retornar null */
	}

}
