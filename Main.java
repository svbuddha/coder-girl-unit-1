public class Main {

    public static void main(String[] args) {
        User ssmith = new User("https://image.freepik.com/free-vector/happy-kids-illustration_23-2147531838.jpg", "SSmith", "Sam", "Smith", "ssmith@gmail.com");
        User jay123 = new User("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQyaW5dXcgaF9WfalN0urqQ7ZizdFXw2V8aPldoaijpuqTNK5VNkQ", "jay123", "Jay", "Ronald", "jay123@gmail.com");
        User tim23 = new User("https://thumbs.dreamstime.com/z/happy-school-kids-cartoon-waving-hand-illustration-50839546.jpg", "tim23", "Tim", "Foster", "time.foster@hotmail.com");

        Blog[] blogs = new Blog[5];
        User[] users = new User[3];
        users[0] = ssmith;
        users[1] = jay123;
        users[2] = tim23;

        int sequenceId = 0;
        
        String content1 = ("Anything here should print as a text and it should be as a message in the blog.");

        String content2 = ("The classes you create for users and posts do not need any special behavior of their own yet.\n" +
                "They just take the data and hold onto it for you. Your primary task is to work through the\n" +
                "syntax of how to create classes and define the data that they hold.");

        String content3 = ("This practice assignment only requires you to create the classes, and create a main() that\n" +
                "constructs them with some test data. In a future practice assignment, you will use these\n" +
                "classes to set up several posts from various users and interact with them. Right now, just focus\n" +
                "on the class definitions for these two classes");

        String content4 = ("When you've created the users and the posts, you should have an array of posts in your main()\n" +
                "method. Loop through the posts and print each one to screen. After the posts are all printed,\n" +
                "then loop through the users and print what you know about each user. The formatting is up to\n" +
                "you; this is just a troubleshooting step to ensure your code is behaving as you expect.");

        String content5 = ("A post will show the following information:\n" +
                "1. The user who posted it\n" +
                "2. An integer for the order in which it was posted\n" +
                "3. The contents of the post\n" +
                "4. Optionally, a web address to a site they linked\n" +
                "Regarding the users who post, they have the following information:\n" +
                "1. The web address (url) to their avatar picture\n" +
                "2. The username\n" +
                "3. The person's real first name and last name\n" +
                "4. The person's email address");
       
        Blog blog1 = new Blog(ssmith, sequenceId, content2);
        blogs[sequenceId] = blog1;
        sequenceId++;

        
        Blog blog2 = new Blog(tim23, sequenceId, content5);
        blogs[sequenceId] = blog2;
        sequenceId++;

        
        Blog blog3 = new Blog(ssmith, sequenceId, content3);
        blogs[sequenceId] = blog3;
        sequenceId++;

        Blog blog4 = new Blog(tim23, sequenceId, content1);
        blogs[sequenceId] = blog4;
        sequenceId++;
        
        Blog blog5 = new Blog(jay123, sequenceId, content4);
        blogs[sequenceId] = blog5;
        sequenceId++;
        

        for(int i = 0 ; i < blogs.length ; ++i){
            blogs[i].print();
            System.out.println("\n");
        }

        for(User user : users){
            user.print();
            System.out.println("\n");
        }

    }
}


