// Jazmine Castillo
//
// This class applies to the manager, who will manage the different types of workers.
// Creating a separate file ensures only code associated with the manager is placed in this file.
// This complies with the Open Close Principle because new code can be added easily while still
// minimizing changes to current code.
// This file implements the Single Responsibility Principle because the activities of the manager
// differ from the workers' activities, therefore changes to workers' code will require minimal changes
// to this file.

package threesolid;

class Manager {
	IWorkable worker;

	public void setWorker(IWorkable w) {
		System.out.format("Setting a worker\n");
		worker = w;
	}

	public void manage() {
		System.out.format("Managing a worker\n");
		worker.work();
	}
}

class ProjectManager extends Manager {
	public void schedulework() {
		System.out.format("Scheduling work...\n");
	}

}

class ProductManager extends Manager {
	public void defineproduct() {
		System.out.format("Defining product...\n");

	}

}
