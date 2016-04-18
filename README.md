
## Slack:

założyć kanał zadania

## Forma:


Przykłady w testach  - zadania na coffee
Quiz app for slack


#### Context configuration

1. XML 
  1. https://gist.github.com/lszydlo/4b42f6cb18fcd276d1a0761a16934b48


#### multiple beans implement same interface
can be bound to array - all implementations will be injected

1. @Primary
2. Qualifier
  1. https://gist.github.com/lszydlo/39d83c8c69f71c9c593bad9050bf1e22
  2. https://spring.io/blog/2014/11/04/a-quality-qualifier
3. Conditional in factory

#### Events

https://gist.github.com/lszydlo/bcfdbb3f9c868bc9022bd6671f3fbdf3
https://spring.io/blog/2015/02/11/better-application-events-in-spring-framework-4-2

#### Conversion Service

http://www.petrikainulainen.net/programming/spring-framework/spring-from-the-trenches-using-type-converters-with-spring-mvc/


## Zadania:


### Spring Context

#### Context configuration ()

1.  assemble coffee maker +
2.  create BeanFactory +
3.  register BeanDefinition in BeanFactory +
4.  configure BeanFactory with XML -
5.  create ApplicationContext +
6.  configure ApplicationContext with @ +
7.  lazy initialize Heater +
  1. define scope for component scan
8.  use qualifier for pump +
9.  migrate spring (@Autowired) to javax.inject (@Inject) +
10. migrate to spring java config +
11. combine all three configurations +
  1. figure out which config is more important +

#### Bean lifecycle (processing and scopes)

1. create BeanFactoryPostProcessor for lazy dev
2. find existing BFPP and describe how they work and what they do
3. create BeanPostProcessor 
4. find existing BPP and describe how they work and what they do
5. use prototype scope to inject beans into grinder // not thread safe / with provider like factory / 
6. create custom scope for memory leak object.

#### Environment (profiles and properties)

1. define profile
2. use profile
3. get property
4. create property source
5. use property source annotation 


#### Events
1. notify user that context is refreshed
2. send notification to facebook when coffee is made


#### Resources
1. display coffee success message from file

#### Data binding and validation
1. use BeanWrapper
2. create custom property editor for Pesel
3. ConversionService

#### Aspects

1. create proxy
2. define aspects for method
3. define aspect for annotation

#### Summary
1. find in spring documentation difference between BeanFactory and ApplicationContext



