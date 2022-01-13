package P1;
public class Dados {
    int posicao = 0;
    Object[] dados = new Object[4];

    public String add(Object obj) { // método pra savar as posições no array com a contadora posicao
        String mensagem;
        if (posicao < dados.length) { // if para verificar se a posicao da lista é maior que o tamanho da lista
            dados[posicao] = obj;
            posicao++;
            mensagem = "Item salvo com sucesso";
        } else {
            mensagem = "limite excedido";
        }
        return mensagem;
    }

}
