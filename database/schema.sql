USE shopping_cart_localization;

DELETE FROM localization_strings;

INSERT INTO localization_strings (language, `key`, value) VALUES
('en', 'title', 'Shopping Cart'),
('en', 'prompt.noItems', 'Enter number of items:'),
('en', 'prompt.priceItem', 'Enter price for item {0}:'),
('en', 'prompt.quantityItem', 'Enter quantity for item {0}:'),
('en', 'button.enter', 'Enter'),
('en', 'button.calculate', 'Calculate'),
('en', 'label.total', 'Total:'),
('en', 'error.invalidInput', 'Invalid input'),

('ar', 'title', 'عربة التسوق'),
('ar', 'prompt.noItems', 'أدخل عدد العناصر:'),
('ar', 'prompt.priceItem', 'أدخل سعر العنصر {0}:'),
('ar', 'prompt.quantityItem', 'أدخل كمية العنصر {0}:'),
('ar', 'button.enter', 'إدخال'),
('ar', 'button.calculate', 'احسب'),
('ar', 'label.total', 'المجموع:'),
('ar', 'error.invalidInput', 'إدخال غير صالح'),

('fi', 'title', 'Ostoskori'),
('fi', 'prompt.noItems', 'Anna tuotteiden määrä:'),
('fi', 'prompt.priceItem', 'Anna tuotteen {0} hinta:'),
('fi', 'prompt.quantityItem', 'Anna tuotteen {0} määrä:'),
('fi', 'button.enter', 'Syötä'),
('fi', 'button.calculate', 'Laske'),
('fi', 'label.total', 'Yhteensä:'),
('fi', 'error.invalidInput', 'Virheellinen syöte'),

('sv', 'title', 'Varukorg'),
('sv', 'prompt.noItems', 'Ange antal varor:'),
('sv', 'prompt.priceItem', 'Ange pris för vara {0}:'),
('sv', 'prompt.quantityItem', 'Ange antal för vara {0}:'),
('sv', 'button.enter', 'Ange'),
('sv', 'button.calculate', 'Beräkna'),
('sv', 'label.total', 'Totalt:'),
('sv', 'error.invalidInput', 'Ogiltig inmatning'),

('ja', 'title', 'ショッピングカート'),
('ja', 'prompt.noItems', '商品の数を入力してください:'),
('ja', 'prompt.priceItem', '商品 {0} の価格を入力してください:'),
('ja', 'prompt.quantityItem', '商品 {0} の数量を入力してください:'),
('ja', 'button.enter', '入力'),
('ja', 'button.calculate', '計算'),
('ja', 'label.total', '合計:'),
('ja', 'error.invalidInput', '無効な入力です');