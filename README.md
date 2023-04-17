# Build and run...

All you need is run these commands:

- `mvn clean package -DskipTest`
- `java -jar target/BancoServices-0.0.1-SNAPSHOT.jar`

# Get accounts

```
curl 'http://localhost:8080/api/v1/cuentas'
```

# Create an account

```
curl -X POST 'http://localhost:8080/api/v1/cuentas' \
  --header 'Content-Type: application/json' \
  --data '{"tipoCuenta": 1,"balance": 878.22}'
```

Enjoy!