
package service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _EventFinished_QNAME = new QName("http://businessLogic/", "EventFinished");
    private final static QName _QuestionAlreadyExist_QNAME = new QName("http://businessLogic/", "QuestionAlreadyExist");
    private final static QName _CreateQuestion_QNAME = new QName("http://businessLogic/", "createQuestion");
    private final static QName _CreateQuestionResponse_QNAME = new QName("http://businessLogic/", "createQuestionResponse");
    private final static QName _GetEvents_QNAME = new QName("http://businessLogic/", "getEvents");
    private final static QName _GetEventsMonth_QNAME = new QName("http://businessLogic/", "getEventsMonth");
    private final static QName _GetEventsMonthResponse_QNAME = new QName("http://businessLogic/", "getEventsMonthResponse");
    private final static QName _GetEventsResponse_QNAME = new QName("http://businessLogic/", "getEventsResponse");
    private final static QName _InitializeBD_QNAME = new QName("http://businessLogic/", "initializeBD");
    private final static QName _InitializeBDResponse_QNAME = new QName("http://businessLogic/", "initializeBDResponse");
    private final static QName _IsLogin_QNAME = new QName("http://businessLogic/", "isLogin");
    private final static QName _IsLoginResponse_QNAME = new QName("http://businessLogic/", "isLoginResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EventFinished }
     * 
     */
    public EventFinished createEventFinished() {
        return new EventFinished();
    }

    /**
     * Create an instance of {@link QuestionAlreadyExist }
     * 
     */
    public QuestionAlreadyExist createQuestionAlreadyExist() {
        return new QuestionAlreadyExist();
    }

    /**
     * Create an instance of {@link CreateQuestion }
     * 
     */
    public CreateQuestion createCreateQuestion() {
        return new CreateQuestion();
    }

    /**
     * Create an instance of {@link CreateQuestionResponse }
     * 
     */
    public CreateQuestionResponse createCreateQuestionResponse() {
        return new CreateQuestionResponse();
    }

    /**
     * Create an instance of {@link GetEvents }
     * 
     */
    public GetEvents createGetEvents() {
        return new GetEvents();
    }

    /**
     * Create an instance of {@link GetEventsMonth }
     * 
     */
    public GetEventsMonth createGetEventsMonth() {
        return new GetEventsMonth();
    }

    /**
     * Create an instance of {@link GetEventsMonthResponse }
     * 
     */
    public GetEventsMonthResponse createGetEventsMonthResponse() {
        return new GetEventsMonthResponse();
    }

    /**
     * Create an instance of {@link GetEventsResponse }
     * 
     */
    public GetEventsResponse createGetEventsResponse() {
        return new GetEventsResponse();
    }

    /**
     * Create an instance of {@link InitializeBD }
     * 
     */
    public InitializeBD createInitializeBD() {
        return new InitializeBD();
    }

    /**
     * Create an instance of {@link InitializeBDResponse }
     * 
     */
    public InitializeBDResponse createInitializeBDResponse() {
        return new InitializeBDResponse();
    }

    /**
     * Create an instance of {@link IsLogin }
     * 
     */
    public IsLogin createIsLogin() {
        return new IsLogin();
    }

    /**
     * Create an instance of {@link IsLoginResponse }
     * 
     */
    public IsLoginResponse createIsLoginResponse() {
        return new IsLoginResponse();
    }

    /**
     * Create an instance of {@link Event }
     * 
     */
    public Event createEvent() {
        return new Event();
    }

    /**
     * Create an instance of {@link Question }
     * 
     */
    public Question createQuestion() {
        return new Question();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EventFinished }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EventFinished }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "EventFinished")
    public JAXBElement<EventFinished> createEventFinished(EventFinished value) {
        return new JAXBElement<EventFinished>(_EventFinished_QNAME, EventFinished.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QuestionAlreadyExist }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link QuestionAlreadyExist }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "QuestionAlreadyExist")
    public JAXBElement<QuestionAlreadyExist> createQuestionAlreadyExist(QuestionAlreadyExist value) {
        return new JAXBElement<QuestionAlreadyExist>(_QuestionAlreadyExist_QNAME, QuestionAlreadyExist.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateQuestion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateQuestion }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "createQuestion")
    public JAXBElement<CreateQuestion> createCreateQuestion(CreateQuestion value) {
        return new JAXBElement<CreateQuestion>(_CreateQuestion_QNAME, CreateQuestion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateQuestionResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateQuestionResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "createQuestionResponse")
    public JAXBElement<CreateQuestionResponse> createCreateQuestionResponse(CreateQuestionResponse value) {
        return new JAXBElement<CreateQuestionResponse>(_CreateQuestionResponse_QNAME, CreateQuestionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEvents }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetEvents }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "getEvents")
    public JAXBElement<GetEvents> createGetEvents(GetEvents value) {
        return new JAXBElement<GetEvents>(_GetEvents_QNAME, GetEvents.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEventsMonth }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetEventsMonth }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "getEventsMonth")
    public JAXBElement<GetEventsMonth> createGetEventsMonth(GetEventsMonth value) {
        return new JAXBElement<GetEventsMonth>(_GetEventsMonth_QNAME, GetEventsMonth.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEventsMonthResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetEventsMonthResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "getEventsMonthResponse")
    public JAXBElement<GetEventsMonthResponse> createGetEventsMonthResponse(GetEventsMonthResponse value) {
        return new JAXBElement<GetEventsMonthResponse>(_GetEventsMonthResponse_QNAME, GetEventsMonthResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEventsResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetEventsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "getEventsResponse")
    public JAXBElement<GetEventsResponse> createGetEventsResponse(GetEventsResponse value) {
        return new JAXBElement<GetEventsResponse>(_GetEventsResponse_QNAME, GetEventsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InitializeBD }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InitializeBD }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "initializeBD")
    public JAXBElement<InitializeBD> createInitializeBD(InitializeBD value) {
        return new JAXBElement<InitializeBD>(_InitializeBD_QNAME, InitializeBD.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InitializeBDResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InitializeBDResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "initializeBDResponse")
    public JAXBElement<InitializeBDResponse> createInitializeBDResponse(InitializeBDResponse value) {
        return new JAXBElement<InitializeBDResponse>(_InitializeBDResponse_QNAME, InitializeBDResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IsLogin }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IsLogin }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "isLogin")
    public JAXBElement<IsLogin> createIsLogin(IsLogin value) {
        return new JAXBElement<IsLogin>(_IsLogin_QNAME, IsLogin.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IsLoginResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IsLoginResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "isLoginResponse")
    public JAXBElement<IsLoginResponse> createIsLoginResponse(IsLoginResponse value) {
        return new JAXBElement<IsLoginResponse>(_IsLoginResponse_QNAME, IsLoginResponse.class, null, value);
    }

}
