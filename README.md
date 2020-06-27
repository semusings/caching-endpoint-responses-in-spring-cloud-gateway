# Caching endpoing responses in Spring Cloud Gateway

Blog: <https://bhuwanupadhyay/blog/blog-code-example-template/>

## Walkthrough

In microservice architecture the services are run in several different places at the same time means that any network delays will affect response time.
Also, othes factors like round trip time, a protocol’s handshake latency, time-to-first-byte and time-to-meaningful-response may cause the high latency of requests. To avoid this situation you can cache endpoint's responses in API Gateway. By doing this, you can reduce the number of calls made to your endpoint that ultimately helps to improve the latency of requests to your microservice.

<!--more-->

**Code** I like build the stuff by writing maintainable code.

This blog post shows the available options to create template.

## Create Template

We are done, Thanks for reading! [Github](https://github.com/BhuwanUpadhyay/blog-code-example-template)

## References
- https://bhuwanupadhyay.github.io/blog
- https://bhuwanupadhyay.github.io/cv
