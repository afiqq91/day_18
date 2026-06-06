#!/bin/bash

echo "Clearing old course data..."

mongo instructor_db --eval "db.courses.deleteMany({})"

echo "Importing fresh seed data..."

mongoimport \
  --db instructor_db \
  --collection courses \
  --file seed/courses.json \
  --jsonArray

echo "Course import completed."