# Flood Fill com Pilha e Fila em Java

## 📌 Sobre o projeto

Este projeto implementa o algoritmo **Flood Fill** em Java utilizando:

* `BufferedImage`
* Interface gráfica com `Swing`
* Estruturas de dados implementadas manualmente:

  * **Pilha** (DFS)
  * **Fila** (BFS)
* Programação Orientada a Objetos (POO)

O usuário pode clicar em um ponto da imagem para iniciar o preenchimento e alternar entre os modos de execução utilizando **pilha** ou **fila**.

---

# 🖼️ Funcionamento

Ao clicar em um pixel da imagem:

1. O sistema identifica a cor original do pixel.
2. O algoritmo percorre os pixels vizinhos.
3. Todos os pixels conectados com a mesma cor são preenchidos com a nova cor.

O preenchimento pode ocorrer utilizando:

* **Pilha** → Depth-First Search (DFS)
* **Fila** → Breadth-First Search (BFS)

---

# 🧠 Diferença entre Pilha e Fila

## 🔹 Pilha (DFS)

A pilha utiliza a lógica:

```text
LIFO → Last In, First Out
```

O último elemento inserido é o primeiro a ser removido.

Isso faz com que o Flood Fill explore profundamente uma direção antes de voltar.

---

## 🔹 Fila (BFS)

A fila utiliza a lógica:

```text
FIFO → First In, First Out
```

O primeiro elemento inserido é o primeiro a ser removido.

Isso faz com que o Flood Fill se espalhe em camadas, semelhante a uma onda.

---

# 🏗️ Estrutura do Projeto

```text
src/
│
├── Main.java
├── Tela.java
├── FloodFill.java
├── ImageProcessor.java
├── Pixel.java
├── Estrutura.java
├── Pilha.java
├── Fila.java
└── Node.java
```

---

# 📚 Classes Principais

## `FloodFill`

Responsável pela lógica principal do algoritmo.

Funções:

* armazenar pixels
* verificar limites da imagem
* preencher pixels
* adicionar vizinhos

---

## `ImageProcessor`

Responsável por:

* carregar imagens
* acessar pixels
* alterar cores
* salvar imagens

Utiliza `BufferedImage`.

---

## `Pilha`

Implementação manual de uma pilha utilizando nós encadeados.

Operações:

* adicionar (push)
* remover (pop)
* verificar se está vazia

---

## `Fila`

Implementação manual de uma fila utilizando nós encadeados.

Operações:

* adicionar (enqueue)
* remover (dequeue)
* verificar se está vazia

---

## `Node`

Representa um nó encadeado contendo:

* um `Pixel`
* referência para o próximo nó

---

## `Pixel`

Classe simples responsável por armazenar:

* coordenada X
* coordenada Y

---

# ▶️ Como executar

## Requisitos

* Java JDK 17+ (ou superior)
* IntelliJ IDEA (recomendado)

---

## Passos

1. Clone o repositório:

```bash
git clone <url-do-repositorio>
```

2. Abra o projeto na IDE.

3. Coloque a imagem `star.png` na raiz do projeto.

4. Execute a classe:

```text
Main.java
```

---

# 🎮 Como usar

* Clique na imagem para iniciar o Flood Fill.
* Utilize o botão inferior para alternar entre:

  * Pilha
  * Fila

---

# 🧪 Conceitos utilizados

* Programação Orientada a Objetos
* Encapsulamento
* Interfaces
* Estruturas encadeadas
* Flood Fill
* DFS (Depth-First Search)
* BFS (Breadth-First Search)
* Manipulação de imagens
* Swing

---

# 📷 Resultado esperado

O algoritmo preencherá a área conectada do pixel selecionado utilizando a estrutura escolhida.

---

# 👨‍💻 Autor

Projeto desenvolvido por marco capote para estudo de estruturas de dados e algoritmos de Flood Fill em Java.
