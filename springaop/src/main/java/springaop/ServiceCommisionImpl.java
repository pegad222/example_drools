package springaop;

import java.io.Serializable;

import org.drools.KnowledgeBase;
import org.drools.base.RuleNameStartsWithAgendaFilter;
import org.drools.runtime.StatefulKnowledgeSession;

public class ServiceCommisionImpl implements ServiceCommision, Serializable {
	
	
	private static final long serialVersionUID = 1L;
	
	private StatefulKnowledgeSession ksession; 

    private KnowledgeBase kbase;
	

	public ServiceCommisionImpl() {
		super();
	}

	public StatefulKnowledgeSession getKsession() {
		return ksession;
	}

	public void setKsession(StatefulKnowledgeSession ksession) {
		this.ksession = ksession;
	}

	public KnowledgeBase getKbase() {
		return kbase;
	}

	public void setKbase(KnowledgeBase kbase) {
		this.kbase = kbase;
	}

	public void obtenerComision(CommisionValue com) {
		// TODO Auto-generated method stub
		RuleNameStartsWithAgendaFilter appServiceFilter = null;
		appServiceFilter = new RuleNameStartsWithAgendaFilter("regla_");
		this.getKsession().insert(com);
        this.getKsession().fireAllRules(appServiceFilter);
	}

}
