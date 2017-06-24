package br.com.ddmsoftware.testimagewithtext;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dmoraes on 22/06/2017.
 */

public class Quote {

    public String author;
    public String quote;
    public int[] quoteFontColor;
    public int authorBackground;


    Quote(String author, String quote, int[] quoteFontColor, int authorBackground) {
        this.author = author;
        this.quote = quote;
        this.quoteFontColor = quoteFontColor;
        this.authorBackground = authorBackground;
    }


    Quote() {

    }

    public List initializeData() {

        Author authors = new Author();

        int[] aColorGray = new int[3];

        aColorGray[0] = 255; aColorGray[1] = 61; aColorGray[2] = 61;

        int[] aColorRed = new int[3];

        aColorRed[0] = 255;// R
        aColorRed[1] = 100;// G
        aColorRed[2] = 100;// B

        int[] aColorWhite = new int[3];

        aColorWhite[0] = 255; //
        aColorWhite[1] = 255;
        aColorWhite[2] = 255;

        int[] aColorBlack = new int[3];

        aColorBlack[0] = 0;
        aColorBlack[1] = 0;
        aColorBlack[2] = 0;

        List<Quote> quotes = new ArrayList<>();

        quotes.add(new Quote("Confúcio","Ainda não vi ninguém que ame a virtude tanto quanto ama a beleza do corpo.",aColorWhite,R.drawable.confucio));
        quotes.add(new Quote("Confúcio","Aja antes de falar e, portanto, fale de acordo com os seus atos",aColorWhite,R.drawable.confucio));
        quotes.add(new Quote("Confúcio","Até que o sol não brilhe, acendamos uma vela na escuridão.",aColorWhite,R.drawable.confucio));
        quotes.add(new Quote("Confúcio","Coloque a lealdade e a confiança acima de qualquer coisa... não te alies aos moralmente inferiores; não receies corrigir teus erros.",aColorWhite,R.drawable.confucio));
        quotes.add(new Quote("Confúcio","Não são as ervas más que afogam a boa semente, e sim a negligência do lavrador.",aColorWhite,R.drawable.confucio));
        quotes.add(new Quote("Confúcio","Quando vires um homem bom, tenta imitá-lo. Quando vires um homem mau, examina-te a ti mesmo.",aColorWhite,R.drawable.confucio));
        quotes.add(new Quote("Confúcio","Se queres prever o futuro, estuda o passado.",aColorWhite,R.drawable.confucio));
        quotes.add(new Quote("Confúcio","Transportai um punhado de terra todos os dias e fareis uma montanha.",aColorWhite,R.drawable.confucio));
        quotes.add(new Quote("Confúcio","Querem que vos ensine o modo de chegar à ciência verdadeira? Aquilo que se sabe, saber que se sabe; aquilo que não se sabe, saber que não se sabe; na verdade é este o saber.",aColorWhite,R.drawable.confucio));
        quotes.add(new Quote("Confúcio","A preguiça anda tão devagar, que a pobreza facilmente a alcança.",aColorWhite,R.drawable.confucio));
        quotes.add(new Quote("Confúcio","O que sabemos, saber que o sabemos. Aquilo que não sabemos, saber que não o sabemos: eis o verdadeiro saber.",aColorWhite,R.drawable.confucio));
        quotes.add(new Quote("Confúcio","Quem de manhã compreendeu os ensinamentos da sabedoria, à noite pode morrer contente.",aColorWhite,R.drawable.confucio));
        quotes.add(new Quote("Confúcio","Não há coisa mais fria do que o conselho cuja aplicação seja impossível.",aColorWhite,R.drawable.confucio));
        quotes.add(new Quote("Confúcio","O homem superior atribui a culpa a si próprio. O homem comum aos outros.",aColorWhite,R.drawable.confucio));
        quotes.add(new Quote("Confúcio","O coração do sábio, tal como o espelho, deve a tudo reflectir, sem todavia macular-se.",aColorWhite,R.drawable.confucio));
        quotes.add(new Quote("Confúcio","Saber o que é correcto e não o fazer é falta de coragem.",aColorWhite,R.drawable.confucio));
        quotes.add(new Quote("Confúcio","A experiência é uma lanterna dependurada nas costas que apenas ilumina o caminho já percorrido.",aColorWhite,R.drawable.confucio));
        quotes.add(new Quote("Confúcio","Da força à injustiça há só um passo.",aColorWhite,R.drawable.confucio));
        quotes.add(new Quote("Confúcio","A humildade é a única base sólida de todas as virtudes.",aColorWhite,R.drawable.confucio));
        quotes.add(new Quote("Confúcio","Quem não sabe o que é a vida, como poderá saber o que é a morte?",aColorWhite,R.drawable.confucio));
        quotes.add(new Quote("Confúcio","Quando os médicos diferem, o paciente morre.",aColorWhite,R.drawable.confucio));


        quotes.add(new Quote("Mahatma Gandhi","A alegria está na luta, na tentativa, no sofrimento envolvido e não na vitoria propriamente dita.",aColorWhite,R.drawable.gandhi));
        quotes.add(new Quote("Mahatma Gandhi","A força não provém da capacidade física e sim de uma vontade indomável.",aColorWhite,R.drawable.gandhi));
        quotes.add(new Quote("Mahatma Gandhi","A não-violência e a covardia não combinam. Posso imaginar um homem armado até os dentes que no fundo é um covarde. A posse de armas insinua um elemento de medo, se não mesmo de covardia. Mas a verdadeira não-violência é uma impossibilidade sem a posse de um destemor inflexível.",aColorWhite,R.drawable.gandhi));
        quotes.add(new Quote("Mahatma Gandhi","A vida merece algo além do aumento da sua velocidade.",aColorWhite,R.drawable.gandhi));
        quotes.add(new Quote("Mahatma Gandhi","Aprendi através da experiência amarga a suprema lição: controlar minha ira e torná-la como o calor que é convertido em energia. Nossa ira controlada pode ser convertida numa força capaz de mover o mundo.",aColorWhite,R.drawable.gandhi));
        quotes.add(new Quote("Mahatma Gandhi","As religiões são caminhos diferentes convergindo para o mesmo ponto. Que importância faz se seguimos por caminhos diferentes, desde que alcancemos o mesmo objetivo?",aColorWhite,R.drawable.gandhi));
        quotes.add(new Quote("Mahatma Gandhi","Cada dia a natureza produz o suficiente para nossa carência. Se cada um tomasse o que lhe fosse necessário, não havia pobreza no mundo e ninguém morreria de fome.",aColorWhite,R.drawable.gandhi));
        quotes.add(new Quote("Mahatma Gandhi","Creio na verdade fundamental de todas as grandes religiões do mundo. Creio que são todas concedidas por Deus e creio que eram necessárias para os povos a quem essas religiões foram reveladas. E creio que se pudéssemos todos ler as escrituras das diferentes fés, sob o ponto de vista de seus respectivos seguidores, haveríamos de descobrir que, no fundo, foram todas a mesma coisa e sempre úteis umas às outras.",aColorWhite,R.drawable.gandhi));
        quotes.add(new Quote("Mahatma Gandhi","O amor é a força mais sutil do mundo.",aColorWhite,R.drawable.gandhi));
        quotes.add(new Quote("Mahatma Gandhi","O medo tem alguma utilidade, mas a covardia não.",aColorWhite,R.drawable.gandhi));
        quotes.add(new Quote("Mahatma Gandhi","Olho por olho, e o mundo acabará cego.",aColorWhite,R.drawable.gandhi));
        quotes.add(new Quote("Mahatma Gandhi","Os fracos nunca podem perdoar.",aColorWhite,R.drawable.gandhi));
        quotes.add(new Quote("Mahatma Gandhi","Um homem não pode fazer o certo numa área da vida, enquanto está ocupado em fazer o errado em outra. A vida é um todo indivisível.",aColorWhite,R.drawable.gandhi));
        quotes.add(new Quote("Mahatma Gandhi","Olho por olho, e o mundo acabará cego.",aColorWhite,R.drawable.gandhi));
        quotes.add(new Quote("Mahatma Gandhi","Nunca país algum se elevou sem se ter purificado no fogo do sofrimento.",aColorWhite,R.drawable.gandhi));
        quotes.add(new Quote("Mahatma Gandhi","A minha fé, nas densas trevas, resplandece mais viva.",aColorWhite,R.drawable.gandhi));
        quotes.add(new Quote("Mahatma Gandhi","Só engrandecemos o nosso direito à vida cumprindo o nosso dever de cidadãos do mundo.",aColorWhite,R.drawable.gandhi));
        quotes.add(new Quote("Mahatma Gandhi","A força não provém da capacidade física, mas da vontade férrea.",aColorWhite,R.drawable.gandhi));
        quotes.add(new Quote("Mahatma Gandhi","Estou firmemente convencido que só se perde a liberdade por culpa da própria fraqueza.",aColorWhite,R.drawable.gandhi));
        quotes.add(new Quote("Mahatma Gandhi","A pureza de espírito e a ociosidade são incompatíveis.",aColorWhite,R.drawable.gandhi));
        quotes.add(new Quote("Mahatma Gandhi","A lei de ouro do comportamento é a tolerância mútua, já que nunca pensaremos todos da mesma maneira, já que nunca veremos senão uma parte da verdade e sob ângulos diversos.",aColorWhite,R.drawable.gandhi));
        quotes.add(new Quote("Mahatma Gandhi","O amor nunca faz reclamações, dá sempre. O amor tolera, jamais se irrita e nunca exerce vingança.",aColorWhite,R.drawable.gandhi));
        quotes.add(new Quote("Mahatma Gandhi","A verdadeira felicidade é impossível sem verdadeira saúde, e a verdadeira saúde é impossível sem um rigoroso controle da gula.",aColorWhite,R.drawable.gandhi));


        quotes.add(new Quote("Winston Churchill","Uma mentira dá uma volta inteira ao mundo antes mesmo de a verdade ter oportunidade de se vestir.",aColorWhite,R.drawable.churchill));
        quotes.add(new Quote("Winston Churchill","Gosto de porcos. Os cães olham-nos de baixo, os gatos de cima. Os porcos olham-nos de igual para igual.",aColorWhite,R.drawable.churchill));
        quotes.add(new Quote("Winston Churchill","Engolir as más palavras que não se dizem, nunca fez mal a ninguém.",aColorWhite,R.drawable.churchill));
        quotes.add(new Quote("Winston Churchill","É uma ideia tipicamente socialista considerar o ganho como um defeito. Eu penso que o verdadeiro defeito é ter perdas.",aColorWhite,R.drawable.churchill));
        quotes.add(new Quote("Winston Churchill","Para uma comunidade, não há melhor investimento do que dar leite aos bebés.",aColorWhite,R.drawable.churchill));
        quotes.add(new Quote("Winston Churchill","Quando se deve matar um homem, não custa nada ser gentil.",aColorWhite,R.drawable.churchill));
        quotes.add(new Quote("Winston Churchill","É sempre prudente olhar em frente, mas é difícil olhar para mais longe do que pode ver-se.",aColorWhite,R.drawable.churchill));
        quotes.add(new Quote("Winston Churchill","De tempos em tempos, os homens tropeçam na verdade, mas a maioria deles se levanta e segue adiante como se nada tivesse acontecido.",aColorWhite,R.drawable.churchill));
        quotes.add(new Quote("Winston Churchill","Ninguém tem dor de estômago por engolir palavras cruéis que deixou de dizer.",aColorWhite,R.drawable.churchill));
        quotes.add(new Quote("Winston Churchill","Problemas que vêm com a vitória são mais agradáveis do que os da derrota, mas igualmente difíceis.",aColorWhite,R.drawable.churchill));
        quotes.add(new Quote("Winston Churchill","Uma pessoa de vez em quando tropeça sobre a verdade, mas na maioria das vezes se levanta e continua andando.",aColorWhite,R.drawable.churchill));
        quotes.add(new Quote("Winston Churchill","Um otimista vê uma oportunidade em cada calamidade. Um pessimista vê uma calamidade em cada oportunidade.",aColorWhite,R.drawable.churchill));
        quotes.add(new Quote("Winston Churchill","Não passamos de minhocas. Mas acredito ser uma minhoca que brilha.",aColorWhite,R.drawable.churchill));
        quotes.add(new Quote("Winston Churchill","Vivemos com o que recebemos, mas marcamos a vida com o que damos.",aColorWhite,R.drawable.churchill));
        quotes.add(new Quote("Winston Churchill","Um apaziguador é alguém que alimenta um crocodilo esperando ser o último a ser devorado.",aColorWhite,R.drawable.churchill));
        quotes.add(new Quote("Winston Churchill","Ninguém pretende que a democracia seja perfeita ou sem defeito. Tem-se dito que a democracia é a pior forma de governo, salvo todas as demais formas que têm sido experimentadas de tempos em tempos",aColorWhite,R.drawable.churchill));
        quotes.add(new Quote("Winston Churchill","A história será gentil para mim, pois pretendo escrevê-la.",aColorWhite,R.drawable.churchill));
        quotes.add(new Quote("Winston Churchill","Uma piada é uma coisa muito séria.",aColorWhite,R.drawable.churchill));


        quotes.add(new Quote("Bob Marley","Unidos venceremos. Divididos, Cairemos",aColorWhite,R.drawable.bobmarley));
        quotes.add(new Quote("Bob Marley","Vocês riem de mim por eu ser diferente, e eu rio de vocês por serem todos iguais",aColorWhite,R.drawable.bobmarley));
        quotes.add(new Quote("Bob Marley","Escrevo aqui no presente para que no futuro seus olhos possam lembrar de mim, quando sua mente me esquecer",aColorWhite,R.drawable.bobmarley));
        quotes.add(new Quote("Bob Marley","Para que levar a vida tão a sério, se a vida é uma alucinante aventura da qual jamais sairemos vivos.",aColorWhite,R.drawable.bobmarley));
        quotes.add(new Quote("Bob Marley","Se Deus criou as pessoas para amar e as coisas para cuidar, por que amamos as coisas e usamos as pessoas?",aColorWhite,R.drawable.bobmarley));
        quotes.add(new Quote("Bob Marley","Prefiro perder a guerra e ganhar a paz.",aColorWhite,R.drawable.bobmarley));
        quotes.add(new Quote("Bob Marley","Sou louco porque vivo em um mundo que não merece minha lucidez",aColorWhite,R.drawable.bobmarley));
        quotes.add(new Quote("Bob Marley","Não viva para que a sua presença seja notada, mas para que a sua falta seja sentida...",aColorWhite,R.drawable.bobmarley));
        quotes.add(new Quote("Bob Marley","Não ligo que me olhem da cabeça aos pés..porque nunca farão minha cabeça e nunca chegarão aos meus pés",aColorWhite,R.drawable.bobmarley));
        quotes.add(new Quote("Bob Marley","Se choras por não ter visto o pôr-do-sol, as lágrimas não lhe permitirão ver as estrelas.",aColorWhite,R.drawable.bobmarley));
        quotes.add(new Quote("Bob Marley","Nos chamam de loucos,num mundo em que os certos fazem bombas!",aColorWhite,R.drawable.bobmarley));
        quotes.add(new Quote("Bob Marley","Se você houve o reggae e não sente nada,então já está morto!",aColorWhite,R.drawable.bobmarley));
        quotes.add(new Quote("Bob Marley","Não cruze os braços diante de uma dificuldade, pois o maior homem do mundo morreu de braços abertos!",aColorWhite,R.drawable.bobmarley));
        quotes.add(new Quote("Bob Marley","Já estive aqui antes e voltarei outra vez, mas não terminarei esta viagem.",aColorWhite,R.drawable.bobmarley));
        quotes.add(new Quote("Bob Marley","...Loucos como nós vivem pouco mais vivem como querem...",aColorWhite,R.drawable.bobmarley));
        quotes.add(new Quote("Bob Marley","Todos caem mas, apenas os fracos continuam no chão...",aColorWhite,R.drawable.bobmarley));
        quotes.add(new Quote("Bob Marley","Não sou nenhum anjo. Sou filho da vida.",aColorWhite,R.drawable.bobmarley));
        quotes.add(new Quote("Bob Marley ","Eu sou do tamanho daquilo que SINTO, que VEJO e que FAÇO, não do tamanho que os outros me enxergam.",aColorWhite,R.drawable.bobmarley));
        quotes.add(new Quote("Bob Marley","Há pessoas que amam o poder, e outras que tem o poder de amar.",aColorWhite,R.drawable.bobmarley));
        quotes.add(new Quote("Bob Marley","Nós nos recusamos a ser quem vocês queriam que fôssemos, somos o que somos.",aColorWhite,R.drawable.bobmarley));

        return quotes;
    };
}
