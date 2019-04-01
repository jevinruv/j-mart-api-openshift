INSERT INTO role (name)
VALUES
  ('ROLE_USER'),
  ('ROLE_CUSTOMER'),
  ('ROLE_ADMIN');

/*
INSERT INTO user (email, name, password, username)
VALUES
  ('jevinruv@gmail.com', 'Jevin', 'qwerty', 'jevinruv'),
  ('polo@gmail.com', 'Polo', 'qwerty', 'polo');

INSERT INTO user_roles (user_id, role_id)
VALUES
  (1, 1),
  (2, 2);
  */

INSERT INTO shopping_cart (user_id, created_date)
VALUES
(1, 1122),
(2, 23333);


INSERT INTO category (code, name, image_url)
VALUES
('salads', 'Salads & Crispy Greens',
 'https://images.pexels.com/photos/1059905/pexels-photo-1059905.jpeg?cs=srgb&dl=appetizer-cucumber-cuisine-1059905.jpg&fm=jpg?dl&fit=crop&crop=entropy&w=640&h=360'),

('soup', 'Soup',
 'https://images.pexels.com/photos/1703272/pexels-photo-1703272.jpeg?cs=srgb&dl=bowl-cuisine-delicious-1703272.jpg&fm=jpg?dl&fit=crop&crop=entropy&w=640&h=426'),

('sandwiches', 'Sandwiches',
 'https://images.pexels.com/photos/1647163/pexels-photo-1647163.jpeg?cs=srgb&dl=blur-bread-breakfast-1647163.jpg&fm=jpg?dl&fit=crop&crop=entropy&w=640&h=426'),

('drinks', 'Drinks',
 'https://images.pexels.com/photos/1232152/pexels-photo-1232152.jpeg?cs=srgb&dl=alcoholic-beverage-beverage-citrus-1232152.jpg&fm=jpg?dl&fit=crop&crop=entropy&w=640&h=447'),

('pasta', 'Pasta',
 'https://images.pexels.com/photos/1438672/pexels-photo-1438672.jpeg?cs=srgb&dl=basil-cheese-close-up-1438672.jpg&fm=jpg?dl&fit=crop&crop=entropy&w=640&h=426');


INSERT INTO product (name, price, description, image_url, category_id)
VALUES
('Green Salad',
 500,
 'Full-flavored tuna salad, with iceberg lettuce and tomato slices, served on whole wheat bread. Complemented by chicken noodle soup',
 'https://images.pexels.com/photos/1059905/pexels-photo-1059905.jpeg?cs=srgb&dl=appetizer-cucumber-cuisine-1059905.jpg&fm=jpg?dl&fit=crop&crop=entropy&w=640&h=360',
 1),

('Mushroom Salad',
 500,
 'Full-flavored tuna salad, with iceberg lettuce and tomato slices, served on whole wheat bread. Complemented by chicken noodle soup',
 'https://images.pexels.com/photos/806361/pexels-photo-806361.jpeg?cs=srgb&dl=appetizer-blur-close-up-806361.jpg&fm=jpg?dl&fit=crop&crop=entropy&w=640&h=423',
 1),


('Mustard Soup',
 520,
 'Chunks of seasoned beef, browned, and then cooked with potatoes, carrots, corn, onion, and peas in a full-flavored brown sauce',
 'https://images.pexels.com/photos/209540/pexels-photo-209540.jpeg?cs=srgb&dl=bowl-broth-cooking-209540.jpg&fm=jpg?dl&fit=crop&crop=entropy&w=640&h=426',
 2),

('Chicken Soup',
 520,
 'Chunks of seasoned beef, browned, and then cooked with potatoes, carrots, corn, onion, and peas in a full-flavored brown sauce',
 'https://images.pexels.com/photos/1275894/pexels-photo-1275894.jpeg?cs=srgb&dl=bowl-chopsticks-close-up-1275894.jpg&fm=jpg?dl&fit=crop&crop=entropy&w=640&h=431',
 2),


('Ham Sandwich',
 540,
 'Chunks of seasoned beef, browned, and then cooked with potatoes, carrots, corn, onion, and peas in a full-flavored brown sauce',
 'https://images.pexels.com/photos/1647163/pexels-photo-1647163.jpeg?cs=srgb&dl=blur-bread-breakfast-1647163.jpg&fm=jpg?dl&fit=crop&crop=entropy&w=640&h=426',
 3),

('Tomato Sandwich',
 420,
 'Chunks of seasoned beef, browned, and then cooked with potatoes, carrots, corn, onion, and peas in a full-flavored brown sauce',
 'https://images.pexels.com/photos/1753052/pexels-photo-1753052.jpeg?cs=srgb&dl=bread-close-up-cuisine-1753052.jpg&fm=jpg?dl&fit=crop&crop=entropy&w=640&h=426',
 3),


('Ice Coffee',
 250,
 'Chunks of seasoned beef, browned, and then cooked with potatoes, carrots, corn, onion, and peas in a full-flavored brown sauce',
 'https://images.pexels.com/photos/1162455/pexels-photo-1162455.jpeg?cs=srgb&dl=brown-color-drink-1162455.jpg&fm=jpg?dl&fit=crop&crop=entropy&w=640&h=853',
 4),

('Lemon Delight',
 300,
 'Chunks of seasoned beef, browned, and then cooked with potatoes, carrots, corn, onion, and peas in a full-flavored brown sauce',
 'https://images.pexels.com/photos/1232152/pexels-photo-1232152.jpeg?cs=srgb&dl=alcoholic-beverage-beverage-citrus-1232152.jpg&fm=jpg?dl&fit=crop&crop=entropy&w=640&h=447',
 4),


('Beef Pasta',
 880,
 'The ground beef is seasoned "Italian" style, and sautéed with fresh onion and pepper. Served over pasta with red sauce and combined with a side salad',
 'https://images.pexels.com/photos/1527603/pexels-photo-1527603.jpeg?cs=srgb&dl=beans-cheese-close-up-1527603.jpg&fm=jpg?dl&fit=crop&crop=entropy&w=640&h=426',
 5),

('Cheese Pasta',
 990,
 'The ground beef is seasoned "Italian" style, and sautéed with fresh onion and pepper. Served over pasta with red sauce and combined with a side salad',
 'https://images.pexels.com/photos/1438672/pexels-photo-1438672.jpeg?cs=srgb&dl=basil-cheese-close-up-1438672.jpg&fm=jpg?dl&fit=crop&crop=entropy&w=640&h=426',
 5);


INSERT INTO discount (percentage, product_id)
VALUES
  (25, 1),
  (25, 3),
  (25, 4),
  (35, 7);
