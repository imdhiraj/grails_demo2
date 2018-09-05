import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_grails_demo2_userdeleteUser_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/user/deleteUser.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(2)
invokeTag('captureMeta','sitemesh',10,['gsp_sm_xmlClosingForEmptyTag':(""),'charset':("UTF-8")],-1)
printHtmlPart(2)
createTagBody(2, {->
createClosureForHtmlPart(3, 3)
invokeTag('captureTitle','sitemesh',11,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',11,[:],2)
printHtmlPart(4)
})
invokeTag('captureHead','sitemesh',15,[:],1)
printHtmlPart(5)
createTagBody(1, {->
printHtmlPart(6)
createClosureForHtmlPart(7, 2)
invokeTag('link','g',25,['action':("home"),'controller':("user")],2)
printHtmlPart(8)
createClosureForHtmlPart(9, 2)
invokeTag('link','g',41,['action':("addUser"),'controller':("user")],2)
printHtmlPart(10)
createClosureForHtmlPart(11, 2)
invokeTag('link','g',42,['action':("viewUser"),'controller':("user")],2)
printHtmlPart(10)
createClosureForHtmlPart(12, 2)
invokeTag('link','g',43,['action':("deleteUser"),'controller':("user")],2)
printHtmlPart(13)
createClosureForHtmlPart(14, 2)
invokeTag('link','g',49,['action':("logout"),'controller':("user")],2)
printHtmlPart(15)
createTagBody(2, {->
printHtmlPart(16)
invokeTag('submitButton','g',63,['name':("Delete User")],-1)
printHtmlPart(17)
})
invokeTag('form','g',64,['action':("deleteUser"),'controller':("user")],2)
printHtmlPart(18)
})
invokeTag('captureBody','sitemesh',64,[:],1)
printHtmlPart(19)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1534997347382L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
