package homework;

public class OperationsOnUser implements Saveble, Reportble {

        private final User user;

        public OperationsOnUser(User user) {
            this.user = user;
        }

        @Override
        public void saveUser() {
            System.out.println("Save user: " + user.getName());
        }

        @Override
        public void reportUser() {
            System.out.println("Report for user: " + user.getName());
        }
    }
