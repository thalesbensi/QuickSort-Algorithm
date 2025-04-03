# QuickSort-Algorithm

Este projeto apresenta uma implementação do algoritmo **QuickSort** em Java. O QuickSort é um dos algoritmos de ordenação mais eficientes, utilizando a estratégia de divisão e conquista para organizar elementos em uma lista.

## 📌 Tecnologias Utilizadas

- **Java 17**

## 🚀 Como Executar

### Clonando o Repositório

```sh
git clone https://github.com/thalesbensi/QuickSort-Algorithm.git
cd QuickSort-Algorithm
```

### Compilando e Executando

```sh
mvn clean install
java -jar target/quicksort-algorithm.jar
```

## 🖥️ Exemplo de Uso

A implementação recebe uma lista de números inteiros para ser ordenada:

```java
int[] array = {34, 7, 23, 32, 5, 62};

QuickSort.sort(array);

System.out.println("Array ordenado: " + Arrays.toString(array));
```

### Saída esperada:
```
Array ordenado: [5, 7, 23, 32, 34, 62]
```

## 📜 Funcionamento do Algoritmo

O QuickSort funciona da seguinte maneira:

1. **Escolha de um pivô**: Seleciona-se um elemento da lista como pivô.
2. **Particionamento**: Reorganiza-se a lista de forma que todos os elementos menores que o pivô fiquem à esquerda e os maiores à direita.
3. **Recursão**: Aplica-se o mesmo processo recursivamente às sublistas à esquerda e à direita do pivô.

Este método é conhecido por sua eficiência e tem complexidade média de **O(n log n)**.

**Desenvolvido por [Thales Bensi](https://github.com/thalesbensi)**
 
