package org.jbpm.persistence.processinstance;

import org.drools.core.common.InternalKnowledgeRuntime;
import org.jbpm.process.instance.event.SignalManager;
import org.jbpm.process.instance.event.SignalManagerFactory;

public class InfinispanSignalManagerFactory implements SignalManagerFactory {

	public SignalManager createSignalManager(InternalKnowledgeRuntime kruntime) {
		return new InfinispanSignalManager(kruntime);
	}

}
