package main

import (
	"encoding/json"
	"github.com/gorilla/mux"
	"net/http"
)

/**
  Handler for the endpoint /student/{id}
  Test: localhost:8000/student/0
*/
func GetStudent(w http.ResponseWriter, r *http.Request) {
	// p as a map with parameters, only have one parameter now, id
	p := mux.Vars(r)

	for _, student := range students {
		if student.Id == p["id"] {
			// Creates a encoder that writes to to the response w, encode the student object to json
			json.NewEncoder(w).Encode(student)
			return
		}
	}
}

func GetStudents(w http.ResponseWriter, r *http.Response) {
	// TODO
}

func GetRandomStudent(w http.ResponseWriter, r *http.Response) {
	// TODO
}
