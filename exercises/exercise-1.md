# Exercise 1

## Objective

Confirm that the current project can run before packaging changes.

## Tool Verification

* java --version ✅
* node --version ✅
* npm --version ✅
* docker --version ✅
* docker compose version ✅

## MongoDB

MongoDB was running successfully on localhost:27017.

## Backend Verification

Backend started successfully using:

```bash
.\mvnw.cmd spring-boot:run
```

Endpoint tested:

http://localhost:8080/api/instructors

Response:

```json
[]
```

## Frontend Verification

Frontend started successfully using:

```bash
npm run dev
```

Frontend URL:

http://localhost:5173

Result:

Home Page loaded successfully in the browser.

## Issues Found

* npm commands must be executed from the frontend directory.
* Maven commands must be executed from the backend directory.
* No blocking application errors were found.

## Conclusion

Backend, frontend, and MongoDB all run successfully and are ready for packaging.
