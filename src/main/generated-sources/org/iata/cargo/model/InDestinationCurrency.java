
package org.iata.cargo.model;

import java.io.Serializable;
import java.util.Map;
import java.util.Set;
import cz.cvut.kbss.jopa.model.annotations.Id;
import cz.cvut.kbss.jopa.model.annotations.OWLAnnotationProperty;
import cz.cvut.kbss.jopa.model.annotations.OWLClass;
import cz.cvut.kbss.jopa.model.annotations.OWLObjectProperty;
import cz.cvut.kbss.jopa.model.annotations.Properties;
import cz.cvut.kbss.jopa.model.annotations.Types;
import cz.cvut.kbss.jopa.vocabulary.RDFS;
import org.iata.cargo.Vocabulary;


/**
 * Collect totals in target / destination currency
 * 
 * This class was generated by OWL2Java 0.13.3
 * 
 */
@OWLClass(iri = Vocabulary.s_c_InDestinationCurrency)
public class InDestinationCurrency
    implements Serializable
{

    @Id(generated = true)
    protected String id;
    @OWLAnnotationProperty(iri = RDFS.LABEL)
    protected String name;
    @OWLAnnotationProperty(iri = cz.cvut.kbss.jopa.vocabulary.DC.Elements.DESCRIPTION)
    protected String description;
    @Types
    protected Set<String> types;
    @Properties
    protected Map<String, Set<String>> properties;
    /**
     * Collection charges in destination currency - e.g. additional amount charged for the service
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_collectionCharge)
    protected Set<Value> collectionCharge;
    /**
     * Sum of TotalCharges and CollectionCharge
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_grandTotalCollectCharges)
    protected Set<Value> grandTotalCollectCharges;
    /**
     * Total Charges converted to destination currency as per CURRENCY conversion rate
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_totalCharges)
    protected Set<Value> totalCharges;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setTypes(Set<String> types) {
        this.types = types;
    }

    public Set<String> getTypes() {
        return types;
    }

    public void setProperties(Map<String, Set<String>> properties) {
        this.properties = properties;
    }

    public Map<String, Set<String>> getProperties() {
        return properties;
    }

    @Override
    public String toString() {
        return ((((("InDestinationCurrency {"+ name)+"<")+ id)+">")+"}");
    }

    public void setCollectionCharge(Set<Value> collectionCharge) {
        this.collectionCharge = collectionCharge;
    }

    public Set<Value> getCollectionCharge() {
        return collectionCharge;
    }

    public void setGrandTotalCollectCharges(Set<Value> grandTotalCollectCharges) {
        this.grandTotalCollectCharges = grandTotalCollectCharges;
    }

    public Set<Value> getGrandTotalCollectCharges() {
        return grandTotalCollectCharges;
    }

    public void setTotalCharges(Set<Value> totalCharges) {
        this.totalCharges = totalCharges;
    }

    public Set<Value> getTotalCharges() {
        return totalCharges;
    }

}