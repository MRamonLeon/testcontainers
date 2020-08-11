FROM datadog/squid
ADD squid.conf /etc/squid/squid.conf

EXPOSE 3128

# Build the image:
# docker build . -t squid-simple-proxy
# Run the container:
# docker run -d -p 3128:3128 --name proxy-simple squid-simple-proxy

# You can configure your proxy to use this one
# Find out the IP the proxy is running with:
# docker inspect -f '{{range .NetworkSettings.Networks}}{{.IPAddress}}{{end}}' proxy-simple

# Proxy configuration:
# - Server: 172.17.0.2 or 
# - Port: 3128
# - User: 
# - Password: 

# See the request performed with:
# docker exec proxy-simple tail -f /var/log/squid/access.log