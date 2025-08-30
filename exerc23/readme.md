# Exercicio 23 da 2ª lista de exercicios.

Implemente um programa que leia o saldo médio de uma conta corrente.
A seguir, o programa deve apresentar um menu de opções, semelhante a
um caixa eletrônico:
1. Sacar
2. Depositar
3. Exibir limite
Para cada opção o programa deve ser comportar de uma forma diferente:
- Opção 1: solicita ao usuário o valor a ser sacado, se o valor for válido
e o usuário puder sacar (considerar o saldo e o limite), o programa
efetua o saque e exibe o saldo médio atual.
- Opção 2: solicita ao usuário o valor a ser depositado, se o valor for
válido, o programa efetua o depósito e exibe o saldo médio atual.
- Opção 3: exibe o limite conforme a tabela abaixo


| Saldo Médio           | Limite                                         |
| --------------------- | ---------------------------------------------- |
| menor que R$ 500,00        | não há limite                                  |
| de R$ 500,00 a R$ 1.000,00 | de R$ 500,00 a R$ 1.000,00 |
| maior ou igual a R$ 1.000,00     | 15% do saldo médio       |
