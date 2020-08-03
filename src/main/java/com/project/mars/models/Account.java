@Entity
@Table(name = 't_account')
@JsonIdentityInfo(
        generator = ObjectIdGenerators.PropertyGenerator.class,
        propery = 'id')

public class Account{

        @Id
        @ManyToMany(targetEntity = User.class,cascade = CascadeType.ALL)
        @GeneratedValue (strategy = GenerationType.IDENTITY)
        int accountId;

        float amount;
        float profitLoss;

}