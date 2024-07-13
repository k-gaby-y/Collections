import java.util.HashMap;
import java.util.TreeMap;
import java.time.LocalDate;
import java.time.Month;
import java.util.Map;
import java.util.Set;

public class AgendaEventos {
   
    //atributo
    private Map<LocalDate, Evento> eventosMap;

    public AgendaEventos(){
        this.eventosMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao){
        Evento evento = new Evento(nome, atracao);
        eventosMap.put(data, evento);
    }

    public void exibirAgenda(){
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        System.out.println(eventosTreeMap);
    }

    public void obterProximoEvento(){
        //Set<LocalDate> dateSet = eventosMap.keySet();
        //Collection<Evento> values = eventosMap.values();
        //eventosMap.get();
        LocalDate dataAtual = LocalDate.now();
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);

        for(Map.Entry<LocalDate, Evento> entry: eventosTreeMap.entrySet()){
            if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)){
                System.out.println("O proximo evento: " + entry.getValue() + "acontecera na data " + entry.getKey());
                break;
            }
        }

    }


    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();

        System.out.println(LocalDate.now());
      
        agendaEventos.adicionarEvento(LocalDate.of(2024, Month.JULY, 15), "Evento 1", "ACDC");
        agendaEventos.adicionarEvento(LocalDate.of(2025, Month.JUNE, 3), "Evento 1", "ANGRA");
        agendaEventos.adicionarEvento(LocalDate.of(2022, Month.SEPTEMBER, 15), "Evento 1", "SLIPKNOT");

        agendaEventos.exibirAgenda();
       agendaEventos.obterProximoEvento();
    }
}
