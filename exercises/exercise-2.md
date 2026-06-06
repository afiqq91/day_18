# Exercise 2

## Objective

Move environment-specific values out of the code.

## Backend Changes

Updated `application.properties` to use environment variables:

* MONGO_HOST
* MONGO_PORT
* MONGO_DATABASE

Created:

* `.env.example`

Example variables:

* MONGO_USERNAME
* MONGO_PASSWORD
* MONGO_HOST
* MONGO_PORT
* MONGO_DATABASE
* JWT_SECRET

## Frontend Changes

Created:

* `instructor-frontend/.env.example`

Added:

* VITE_API_BASE_URL

Updated `authApi.js` to use:

`import.meta.env.VITE_API_BASE_URL`

instead of a hardcoded URL.

## Verification

Backend starts successfully.

Frontend loads successfully.

MongoDB configuration can be changed without modifying source code.

## Result

Exercise completed successfully.
