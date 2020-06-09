-- Categories
INSERT INTO public.categories (id, category_type, icon, name) VALUES (1, 'SERVICE', 'fas fa-plus', 'Manutenção');
INSERT INTO public.categories (id, category_type, icon, name) VALUES (2, 'PRODUCT', 'fas fa-plus', 'Alimentação');

-- Services
INSERT INTO public.services (id, description, featured_image, name, investment) VALUES (1, 'Lavamos com água e sabão seu PC! Brilhando e cheiroso.', 'https://dummyimage.com/300.png/09f/fff', 'Manutenção de Computadores', 'Faça um orçamento!');
INSERT INTO public.services (id, description, featured_image, name, investment) VALUES (2, 'Seu amigo estará lendo Nietzsche rapidinho!', 'https://dummyimage.com/300.png/09f/fff', 'Alfabetização de Cachorros', 'R$ 180,00/hora');

-- Products
INSERT INTO public.products (id, description, featured_image, name, price) VALUES (1, 'Para quando estiver sozinho', 'https://dummyimage.com/300.png/09f/fff', 'Coçador de Costas', 35.95);
INSERT INTO public.products (id, description, featured_image, name, price) VALUES (2, 'Dieta começa segunda-feira', 'https://dummyimage.com/300.png/09f/fff', 'Brownie', 4.98);

-- Categories X Products, Services
INSERT INTO public.services_categories VALUES (1,1);
INSERT INTO public.services_categories VALUES (2,1);
INSERT INTO public.products_categories VALUES (1,2);
INSERT INTO public.products_categories VALUES (2,2);
