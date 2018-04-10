package main

import (
	"github.com/gorilla/mux"
	"net/http"
	"strconv"
)

var PORT = ":8000"
var studentNames = []string{"Eva", "George", "Hugo", "Humam", "Ivan", "Melvin", "Artin", "Saman", "Sebastian", "Simon"}

var students [10]Student

/**
  Main function to setup everything properly
*/
func main() {
	setupStudents()

	// Creates a router
	r := mux.NewRouter()

	// Setups an endpoint and specifieds handler function
	r.HandleFunc("/student/{id}", GetStudent).Methods("GET")

	// TODO: Add endpoint for GetStudents, which return all the students

	// TODO: Add endpoint for GetRandomStudent, which return a random students

	// Creates a server and listen on port,
	http.ListenAndServe(PORT, r)
}

/**
  Add students to the global slice as Student "objects"
*/
func setupStudents() {
	for i, v := range studentNames {
		students[i] = Student{Id: strconv.Itoa(i), Name: v}
	}
}
