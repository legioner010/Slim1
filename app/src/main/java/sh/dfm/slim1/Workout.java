package sh.dfm.slim1;

/**
 * Created by е on 03.12.2016.
 */
public class Workout {
    private String name;
    private String description;
    private int imageResourceId;

    public Workout(String name, String description, int imageResourceId) {
        this.name = name;
        this.description = description;
        this.imageResourceId = imageResourceId;
    }

    public static Workout[] workouts = {
            new Workout("Склепка",
                    "Лягте на спину, ноги и руки слегка приподнимите (А), это будет вашим исходным положением. Следующим движением будет подъем ног и торса вверх, при этом постарайтесь коснуться руками своих ног (В).\nСделайте 10 повторений.",
                    R.drawable.riveting),
            new Workout("Кик бэк",
                    "Станьте в упор лежа (А), затем изо всех сил вытолкните ваши ноги и ягодицы вверх (В). Вытолкнитесь так высоко, как только сможете.\nСделайте 10 повторений.",
                    R.drawable.kikbek),
            new Workout("Приседания с прыжком",
                    "Станьте прямо, ноги на ширине плеч, руки за головой (А), присядьте(В), а затем выпрыгните вверх, (С). Руки должны все время находиться за головой.\nВыполните 10 повторений.",
                    R.drawable.squat),
            new Workout("Твисты",
                    "Сядьте, спину чуть отклоните назад, руки держите перед собой, а ноги оторвите от пола и держите на весу (А).Поверните ваш торс вправо (В), а затем влево (С), и вернитесь в исходное положение.\nСделайте 15 повторений.",
                    R.drawable.twists),
            new Workout("Прыжки на возвышенность",
                    "Поставьте перед собой таберет, на расстоянии 30 – 40 сантиметров (А), запрыгните на него, стараясь не делать сильный мах руками (В). Спуститесь обратно, в исходное положение.\nСделайте 10 прыжков.",
                    R.drawable.jumping),
            new Workout("Лодочка с мячом",
                    "Лягте на живот, локтями упритесь в пол, а мяч зажмите между ног, согнув их при этом в коленях (А), это ваше исходное положение. Теперь поднимаем ноги вместе с мячом как можно выше (В).\nВыполните 10 повторений.",
                    R.drawable.boat),
            new Workout("Скручивания на мяче",
                    "Станьте в упор лежа, при этом ноги закиньте на шведский мяч, так, чтобы ваши голени располагались на нем, а не ступни (А). Подкручивайте мяч ногами под себя, поднимая бедра и ягодицы вверх (В). Поднимайтесь так высоко, как только у вас получится, а затем медленно вернитесь в исходное положение (А).\nСделайте столько повторов, сколько сможете.",
                    R.drawable.twisting)
    };

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    @Override
    public String toString() {
        return this.toString();
    }
}
