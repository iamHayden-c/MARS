@Entity
@Table(name = "t_user"
@JsonIdentityInfo(
        generator = ObjectIdGenerators.PropertyGenerator.class,
        propery = 'id')
public class User{
    
              // generated unique Identifier for account//
        @Id
        @GeneratedValue (strategy = GenerationType.IDENTITY)
        int userID;

        String fName;
        String lName;
        int age;

        // relationship to pull in Account Unique ID//
        @ManyToMany(targetEntity = User.class, mappedBy = "AccountId", cascade = CascadeType.ALL)
        int account_Id;

}