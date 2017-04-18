package io.swagger.api;

import io.swagger.jaxrs.config.SwaggerContextService;
import io.swagger.models.*;

import io.swagger.models.auth.*;

import javax.servlet.http.HttpServlet;
import javax.servlet.ServletContext;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;

public class Bootstrap extends HttpServlet {
  @Override
  public void init(ServletConfig config) throws ServletException {
    Info info = new Info()
      .title("Swagger Server")
      .description("This is an exclusive API example for DockerCon 2017 participants.  Tips:   - To fork and work on your own version of this API, select 'Fork API' from the '...' menu   - To share and collaborate on your API, email us clicking below with subject line *\"Special trial for DockerCon participants\"*  Click below to email us: mailto:support@swaggerhub.com ")
      .termsOfService("")
      .contact(new Contact()
        .email("support@swaggerhub.com"))
      .license(new License()
        .name("Apache 2.0")
        .url("http://www.apache.org/licenses/LICENSE-2.0.html"));

    ServletContext context = config.getServletContext();
    Swagger swagger = new Swagger().info(info);

    new SwaggerContextService().withServletConfig(config).updateSwagger(swagger);
  }
}
