drop table if exists Profiles cascade ;
drop table if exists Profile cascade ;

drop table if exists FragmentShaders cascade ;
drop table if exists Fragment_Shader cascade ;

CREATE TABLE IF NOT EXISTS Profiles
(
    id INTEGER PRIMARY KEY GENERATED ALWAYS AS IDENTITY,
    nick_name VARCHAR(200) NOT NULL ,
    hash VARCHAR(254) NOT NULL
);

CREATE TABLE IF NOT EXISTS FragmentShaders
(
    id INTEGER PRIMARY KEY GENERATED ALWAYS AS IDENTITY,
    profile_id INTEGER REFERENCES Profiles(id),
    maxFragmentUniformVectors INTEGER,
    maxTextureImageUnits INTEGER,
    precisions CHAR(200),
    bestFloatPrecision CHAR(200),
    maxFragmentUniformComponents INTEGER,
    maxFragmentUniformBlocks INTEGER,
    maxFragmentInputComponents INTEGER,
    minProgramTexelOffset INTEGER,
    maxProgramTexelOffset INTEGER
);



--
-- INSERT INTO Profiles VALUES
--                          (default,'Vassily Petrov', 'vpetrov@jr.com'),
--                          (default,'Pjotr Vasechkin', 'pvasechkin@jr.com');
-- INSERT INTO FragmentShaders VALUES
--                                 (default, 1,324,3235,'Vassirov', 'vpecom', 765,98,9023,411,1234),
--                                 (default, 2,4567,768, 'Pkin', 'pvcom',  742365,342,43,21123,4545);
-- INSERT INTO Profiles VALUES
--     (default,'Tgaseraf JHGFYhjc', 'vpetrov@jr.com');
-- INSERT INTO FragmentShaders VALUES
--     (default, 3,567,311235,'Rtassikjirov', 'vlkjhgpecom', 7165,198,119023,112411,111234);