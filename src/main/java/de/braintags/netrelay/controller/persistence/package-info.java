/**
 * === {@link de.braintags.netrelay.controller.persistence.PersistenceController}
 * The PersistenceController is the instance, which translates the parameters and data of a request into a datastore
 * based action. A request like "http://localhost/article/detail?ID=5&entity=article" will be interpreted by the
 * controller to fetch the article with the id 5 from the datastore and to store it inside the context, so that is can
 * be displayed by a template engine.
 * 
 * The example configuration below defines the Persistence-Controller to be active under the url /article/detail and
 * will let run the above described actions.
 * "http://localhost/article/detail?ID=5&entity=article" will load the article for display,
 * "http://localhost/article/detail?ID=5&entity=article&action=DELETE" will delete this article from the datastore
 * 
 * [source, json]
 * ----
 * {
 * "name" : "PersistenceController",
 * "routes" : [ "/article/detail" ],
 * "controller" : "de.braintags.netrelay.controller.persistence.PersistenceController",
 * "handlerProperties" : {
 * "reroute" : "false",
 * "cleanPath" : "true",
 * "uploadDirectory" : "webroot/upload/",
 * "uploadRelativePath" : "upload/"
 * },
 * "captureCollection" : [ {
 * "captureDefinitions" : [ {
 * "captureName" : "entity",
 * "controllerKey" : "entity",
 * "required" : false
 * }, {
 * "captureName" : "ID",
 * "controllerKey" : "ID",
 * "required" : false
 * }, {
 * "captureName" : "action",
 * "controllerKey" : "action",
 * "required" : false
 * } ]
 * } ]
 * }
 * 
 * ----
 * 
 * 
 * 
 * 
 * 
 */
package de.braintags.netrelay.controller.persistence;
