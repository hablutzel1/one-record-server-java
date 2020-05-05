
package org.iata.cargo.model;

import java.io.Serializable;
import java.util.Map;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import cz.cvut.kbss.jopa.model.annotations.Id;
import cz.cvut.kbss.jopa.model.annotations.OWLAnnotationProperty;
import cz.cvut.kbss.jopa.model.annotations.OWLClass;
import cz.cvut.kbss.jopa.model.annotations.OWLDataProperty;
import cz.cvut.kbss.jopa.model.annotations.Properties;
import cz.cvut.kbss.jopa.model.annotations.Types;
import cz.cvut.kbss.jopa.vocabulary.RDFS;
import org.iata.cargo.Vocabulary;


/**
 * CO2 calculation methods
 * 
 * This class was generated by OWL2Java 0.14.2
 * 
 */
@OWLClass(iri = Vocabulary.s_c_CO2CalcMethod)
public class CO2CalcMethod
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
     * Name of the CO2 calculation method
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_methodName)
    protected Set<String> methodName;
    /**
     * Version of the CO2 calculation method
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_methodVersion)
    protected Set<String> methodVersion;

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
        return ((((("CO2CalcMethod {"+ name)+"<")+ id)+">")+"}");
    }

    public void setMethodName(Set<String> methodName) {
        this.methodName = methodName;
    }

    public Set<String> getMethodName() {
        return methodName;
    }

    public void setMethodVersion(Set<String> methodVersion) {
        this.methodVersion = methodVersion;
    }

    public Set<String> getMethodVersion() {
        return methodVersion;
    }

}