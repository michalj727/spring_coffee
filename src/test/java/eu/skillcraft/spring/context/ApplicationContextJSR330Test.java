package eu.skillcraft.spring.context;

/**
 * |     Spring          |     javax.inject      |        javax.inject
 * |                     |                       |   restrictions/comments
 * ------------------------------------------------------------------------------
 * | @Autowired          | @Inject               | @Inject has no 'required'
 * |                     |                       | attribute; can be used with Java
 * |                     |                       | 8’s Optional instead.
 * ------------------------------------------------------------------------------
 * | @Component          | @Named JSR-330        | does not provide a
 * |                     |                       | composable model, just a way
 * |                     |                       | to identify named components.
 * ------------------------------------------------------------------------------
 * | @Scope("singleton") | @Singleton            | The JSR-330 default scope
 * |                     |                       | is like Spring’s prototype.
 * |                     |                       | However, in order to keep
 * |                     |                       | it consistent with Spring’s
 * |                     |                       | general defaults, a JSR-330
 * |                     |                       | bean declared in the Spring
 * |                     |                       | container is a singleton by
 * |                     |                       | default. In order to use a scope
 * |                     |                       | other than singleton, you
 * |                     |                       | should use Spring’s @Scope
 * |                     |                       | annotation. javax.inject
 * |                     |                       | also provides a @Scope
 * |                     |                       | annotation. Nevertheless, this
 * |                     |                       | one is only intended to be
 * |                     |                       | used for creating your own
 * |                     |                       | annotations.
 * -----------------------------------------------------------------------------
 * | @Qualifier          | @Qualifier / @Named   | javax.inject.Qualifier
 * |                     |                       | is just a meta-annotation
 * |                     |                       | for building custom
 * |                     |                       | qualifiers. Concrete String
 * |                     |                       | qualifiers (like Spring’s
 * |                     |                       | @Qualifier with a value)
 * |                     |                       | can be associated through
 * |                     |                       | javax.inject.Named.
 * -----------------------------------------------------------------------------
 * | @Value              | no equivalent         |
 * -----------------------------------------------------------------------------
 * | @Required           | no equivalent         |
 * -----------------------------------------------------------------------------
 * | @Lazy               | no equivalent         |
 * -----------------------------------------------------------------------------
 * | ObjectFactory       | Provider              | javax.inject.Provider is
 * |                     |                       | a direct alternative to Spring’s
 * |                     |                       | ObjectFactory, just with
 * |                     |                       | a shorter get() method
 * |                     |                       | name. It can also be used
 * |                     |                       | in combination with Spring’s
 * |                     |                       | @Autowired or with nonannotated
 * |                     |                       | constructors and
 * |                     |                       | setter methods.
 * -----------------------------------------------------------------------------
 */
public class ApplicationContextJSR330Test {



}
