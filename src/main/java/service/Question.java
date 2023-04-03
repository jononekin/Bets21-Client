
package service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para question complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="question"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="questionNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="question" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="betMinimum" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="result" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="event" type="{http://www.w3.org/2001/XMLSchema}IDREF" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "question", propOrder = {
    "questionNumber",
    "question",
    "betMinimum",
    "result",
    "event"
})
public class Question {

    protected String questionNumber;
    protected String question;
    protected float betMinimum;
    protected String result;
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object event;

    /**
     * Obtiene el valor de la propiedad questionNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuestionNumber() {
        return questionNumber;
    }

    /**
     * Define el valor de la propiedad questionNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuestionNumber(String value) {
        this.questionNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad question.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuestion() {
        return question;
    }

    /**
     * Define el valor de la propiedad question.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuestion(String value) {
        this.question = value;
    }

    /**
     * Obtiene el valor de la propiedad betMinimum.
     * 
     */
    public float getBetMinimum() {
        return betMinimum;
    }

    /**
     * Define el valor de la propiedad betMinimum.
     * 
     */
    public void setBetMinimum(float value) {
        this.betMinimum = value;
    }

    /**
     * Obtiene el valor de la propiedad result.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResult() {
        return result;
    }

    /**
     * Define el valor de la propiedad result.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResult(String value) {
        this.result = value;
    }

    /**
     * Obtiene el valor de la propiedad event.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getEvent() {
        return event;
    }

    /**
     * Define el valor de la propiedad event.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setEvent(Object value) {
        this.event = value;
    }

}
