<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  ~ Copyright 2013 EnergyOS.org
  ~
  ~    Licensed under the Apache License, Version 2.0 (the "License");
  ~    you may not use this file except in compliance with the License.
  ~    You may obtain a copy of the License at
  ~
  ~        http://www.apache.org/licenses/LICENSE-2.0
  ~
  ~    Unless required by applicable law or agreed to in writing, software
  ~    distributed under the License is distributed on an "AS IS" BASIS,
  ~    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
  ~    See the License for the specific language governing permissions and
  ~    limitations under the License.
  --%>

<!DOCTYPE html>
<html lang="en">

<jsp:include page="tiles/head.jsp"/>

<body>

<jsp:include page="tiles/customer/header.jsp"/>

<div class="container">
	<div class="hero-unit">
		<h1>Welcome to Renova Energy Green Button Data Portal</h1>
			
	</div>
    <!-- 
    <div class="hero-unit">
	<h2>Welcome to the <a href="http://www.energyos.org">EnergyOS</a> Green Button Third Party</h2>
	<p><a href="http://www.energyos.org">EnergyOS</a> has, with the support of <a href="http://pivotallabs.com/">Pivotal Labs</a>, prepared a reference Green Button Third Party implementation.
	    This implementation supports a full complement of Green Button facilities and, as an <a href="https://github.com/energyos">Open Source
        project</a>, is freely available for download by any interested parties.</p>
	<p>

	<span class="inline pull-left"><a href="http://www.greenbuttondata.org" class="btn btn-primary btn-large">Learn more about Green Button &raquo;</a></span>
    <span class="inline pull-right"><a href="http://www.greenbuttondata.org" class="btn btn-primary btn-large">Learn more about EnergyOS Open Source &raquo;</a></span>

    </p>
    </div>
    <div class="row">
        <div class="span4">
            <h3>Third Party Services</h3>
            <p>Green Button Third Parties may, with the authorization of the Retail Customer, subscribe to receive energy and resource usage information 
            from certified <a href="/DataCustodian">Green Button Data Custodians</a>. Subscriptions, using Atom Publishing, allow the Third Party to 
            provide new and innovative consumer services!</p>
            <p><a class="btn" href="#">View details &raquo;</a></p>
        </div>
        <div class="span4">
            <h3>Developers Guide</h3>
            <p>The Green Button Developers Guide provides both overview and detailed information on the mechanisms of Green Button.
               You can learn about Atom feeds and the OData standard from which Green Button was derived, as well as the details
               of the Energy Usage Information contained in Green Button feeds. 
               </p>
            <p><a class="btn" href="http://energyos.github.io/OpenESPI-GreenButton-API-Documentation/">View details &raquo;</a></p>
        </div>
        <div class="span4">
            <h3>API Reference</h3>
            <p>Green Button services are also available via RESTful APIs. APIs allow the developer to use the EnergyOS Data Custodian and
               Third Party servers, hosted at GreenButtonData.org, to develop new applications, providing services and features to better engage the Retail Customer
               to understand their energy usage.
               </p>
            <p><a class="btn" href="http://energyos.github.io/OpenESPI-GreenButton-API-Documentation/API/">View details &raquo;</a></p>
        </div>
    </div>
	-->
	
    <hr>

    <jsp:include page="tiles/footer.jsp"/>

</div>

</body>
</html>