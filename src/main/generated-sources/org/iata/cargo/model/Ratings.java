
package org.iata.cargo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import cz.cvut.kbss.jopa.model.annotations.Id;
import cz.cvut.kbss.jopa.model.annotations.OWLAnnotationProperty;
import cz.cvut.kbss.jopa.model.annotations.OWLClass;
import cz.cvut.kbss.jopa.model.annotations.OWLDataProperty;
import cz.cvut.kbss.jopa.model.annotations.OWLObjectProperty;
import cz.cvut.kbss.jopa.model.annotations.Properties;
import cz.cvut.kbss.jopa.model.annotations.Types;
import cz.cvut.kbss.jopa.vocabulary.RDFS;
import org.iata.cargo.Vocabulary;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Map;
import java.util.Set;


/**
 * Ratings details
 * 
 * This class was generated by OWL2Java 0.14.2
 * 
 */
@OWLClass(iri = Vocabulary.s_c_Ratings)
public class Ratings
    implements Serializable
{

    @Id(generated = true)
    @JsonProperty("@id")
    protected String id;
    @JsonIgnore
    @OWLAnnotationProperty(iri = RDFS.LABEL)
    protected String name;
    @JsonIgnore
    @OWLAnnotationProperty(iri = cz.cvut.kbss.jopa.vocabulary.DC.Elements.DESCRIPTION)
    protected String description;
    @Types
    @JsonProperty("@type")
    protected Set<String> types;
    @Properties
    @JsonIgnore
    protected Map<String, Set<String>> properties;
    /**
     * Reference to the ranges
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_ranges)
    protected Set<Ranges> ranges;
    /**
     * Code of the charge e.g. MY, SC, etc.
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_chargeCode)
    protected Set<String> chargeCode;
    /**
     * Description of the charge e.g. Airfreight, fuel, etc.
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_chargeDescription)
    protected Set<String> chargeDescription;
    /**
     * Type of charge e.g. Freight, Surcharges, etc.
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_chargeType)
    protected Set<String> chargeType;
    /**
     * Specification of the price e.g. Street, Group, Spot, etc.
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_priceSpecification)
    protected Set<String> priceSpecification;
    /**
     * Reference of price specifications
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_priceSpecificationRef)
    protected Set<String> priceSpecificationRef;
    /**
     * Subtotal of the charge
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_subTotal)
    protected Set<BigDecimal> subTotal;

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
        return ((((("Ratings {"+ name)+"<")+ id)+">")+"}");
    }

    public void setRanges(Set<Ranges> ranges) {
        this.ranges = ranges;
    }

    public Set<Ranges> getRanges() {
        return ranges;
    }

    public void setChargeCode(Set<String> chargeCode) {
        this.chargeCode = chargeCode;
    }

    public Set<String> getChargeCode() {
        return chargeCode;
    }

    public void setChargeDescription(Set<String> chargeDescription) {
        this.chargeDescription = chargeDescription;
    }

    public Set<String> getChargeDescription() {
        return chargeDescription;
    }

    public void setChargeType(Set<String> chargeType) {
        this.chargeType = chargeType;
    }

    public Set<String> getChargeType() {
        return chargeType;
    }

    public void setPriceSpecification(Set<String> priceSpecification) {
        this.priceSpecification = priceSpecification;
    }

    public Set<String> getPriceSpecification() {
        return priceSpecification;
    }

    public void setPriceSpecificationRef(Set<String> priceSpecificationRef) {
        this.priceSpecificationRef = priceSpecificationRef;
    }

    public Set<String> getPriceSpecificationRef() {
        return priceSpecificationRef;
    }

    public void setSubTotal(Set<BigDecimal> subTotal) {
        this.subTotal = subTotal;
    }

    public Set<BigDecimal> getSubTotal() {
        return subTotal;
    }

}
