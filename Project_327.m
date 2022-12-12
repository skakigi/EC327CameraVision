% general code

[Banana, Apple, Orange] = read_matrices;
BA = fruit_vector_average(Banana);
AA = fruit_vector_average(Apple);
OA = fruit_vector_average(Orange);
csvwrite('Average_Banana.csv', BA);
csvwrite('Average_Apple.csv', AA);
csvwrite('Average_Orange.csv', OA);

function [banana, apple, orange] = read_matrices
% banana vector calcuations

bananaF = 'bananas/';
bananaFiles = dir(fullfile(bananaF, '*.jpg'));
bananaNames = {bananaFiles.name};
numBananas = length (bananaNames);
count=0;
banana = [];
for i = 1:numBananas
   bananaTemp = bananaNames{i};
   bananaImage = imread(strcat(bananaF, bananaTemp));
   bananaImage = bananaImage(:, :, 1);
   bananaV = reshape(bananaImage, 1, 4096);
   banana = [banana ; bananaV];
end

% apple vector calculations
appleF = 'apples/';
appleFiles = dir(fullfile(appleF, '*.jpg'));
appleNames = {appleFiles.name};
numApples = length (appleNames);

apple = [];
for i = 1:numApples
   appleTemp = appleNames{i};
   appleImage = imread(strcat(appleF, appleTemp));
   appleImage = appleImage(:, :, 1);
   appleV = reshape(appleImage, 1, 4096);
   apple = [apple ; appleV];
end

% orange vector calculataions
orangeF = 'oranges/';
orangeFiles = dir(fullfile(orangeF, '*.jpg'));
orangeNames = {orangeFiles.name};
numOranges = length (orangeNames);

orange = [];
for i = 1:numOranges
   orangeTemp = orangeNames{i};
   orangeImage = imread(strcat(orangeF, orangeTemp));
   orangeImage = orangeImage(:, :, 1);
   orangeV = reshape(orangeImage, 1, 4096);
   orange = [orange ; orangeV];
end

% converts into a double

banana = double(banana);
apple = double(apple);
orange = double(orange);

end



% this function takes in a matrix of fruit.
% it then calculates the average for each row vector.
function out = fruit_vector_average(matrix)
[row, col] = size(matrix);
sum = zeros(1, col);
for i=1:row
    sum = sum + matrix(i,:);
end
out = sum / row;
end
